package org.lucky.io;

import java.io.FilePermission;
import java.security.AccessControlException;
import java.security.PermissionCollection;

public class FilePermissionExample {
    public static void main(String[] args) {
        try {
            // Define a FilePermission for reading a specific file
            FilePermission readPermission = new FilePermission("example.txt", "read");

            // Check if the current security manager allows read access to the file
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {
                sm.checkPermission(readPermission);
                System.out.println("Read access is allowed.");
            } else {
                System.out.println("No security manager is set.");
            }

            // Define a FilePermission for a directory
            FilePermission dirPermission = new FilePermission("/path/to/directory/*", "read,write");

            // Check if the current security manager allows read and write access to the directory
            if (sm != null) {
                sm.checkPermission(dirPermission);
                System.out.println("Read and write access to the directory is allowed.");
            } else {
                System.out.println("No security manager is set.");
            }

            // Combining multiple permissions into a PermissionCollection
            PermissionCollection permissions = readPermission.newPermissionCollection();
            permissions.add(readPermission);
            permissions.add(dirPermission);
        } catch (AccessControlException e) {
            System.out.println("Access denied: " + e.getMessage());
        }
    }
}
