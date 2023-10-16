package org.lucky.classes.object;
import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

public class SoftwareProduct {
    private String productId;
    private String productName;
    private String version;
    private int releaseYear;

    private Closeable resourceToClose;

    public SoftwareProduct(String productId, String productName, String version, int releaseYear, Closeable resourceToClose) {
        this.productId = productId;
        this.productName = productName;
        this.version = version;
        this.releaseYear = releaseYear;
        this.resourceToClose = resourceToClose;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getVersion() {
        return version;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    @Override
    public String toString() {
        return "SoftwareProduct [productId=" + productId + ", productName=" + productName + ", version=" + version
                + ", releaseYear=" + releaseYear + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SoftwareProduct other = (SoftwareProduct) obj;
        return productId.equals(other.productId) && productName.equals(other.productName)
                && version.equals(other.version) && releaseYear == other.releaseYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, version, releaseYear);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new SoftwareProduct(productId, productName, version, releaseYear, resourceToClose);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations before the object is garbage collected
            System.out.println("Cleaning up resources for Product: " + productName);
            if (resourceToClose != null) {
                try {
                    resourceToClose.close();
                    System.out.println("Resource closed successfully.");
                } catch (IOException e) {
                    System.err.println("Failed to close the resource: " + e.getMessage());
                }
            }
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        SoftwareProduct product1 = new SoftwareProduct("12345", "ProductA", "1.0", 2022,null);
        SoftwareProduct product2 = new SoftwareProduct("67890", "ProductA", "1.0", 2022,null);

        // Demonstrate various Object methods
        System.out.println("toString() result: " + product1.toString());
        System.out.println("equals() result: " + product1.equals(product2));
        System.out.println("hashCode() result: " + product1.hashCode());
        // Demonstrate various Object methods
        System.out.println("toString() result: " + product2.toString());
        System.out.println("equals() result: " + product2.equals(product2));
        System.out.println("hashCode() result: " + product2.hashCode());

        try {
            SoftwareProduct clonedProduct = (SoftwareProduct) product1.clone();
            System.out.println("Clone result: " + clonedProduct.toString());
            System.out.println(clonedProduct.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Create a software product with a file resource to close
        Closeable fileResource = new Closeable() {
            @Override
            public void close() throws IOException {
                System.out.println("Closing the file resource.");
                // Add your file-closing logic here
            }
        };

        SoftwareProduct product = new SoftwareProduct("12345", "ProductA", "1.0", 2022, fileResource);

        // Allow the object to become eligible for garbage collection
        product = null;

        // Suggesting garbage collection (for demonstration purposes; normally, it's automatic)
        System.gc();
    }
}
