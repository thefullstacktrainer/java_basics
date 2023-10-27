package org.lucky.collections.set;
import java.util.*;
public class HospitalPatientHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store Indian patient names
        HashSet<String> patientSet = new HashSet<String>();

        // Add some Indian patient names to the HashSet
        patientSet.add("Rajesh Sharma");
        patientSet.add("Priya Patel");
        patientSet.add("Amit Kumar");
        patientSet.add("Anjali Singh");
        patientSet.add("Deepak Verma");

        System.out.println("List of Indian patients in the hospital: " + patientSet);
        // Create an Iterator to iterate through the HashSet
        Iterator<String> iterator = patientSet.iterator();

        System.out.println("Iterating through the HashSet:");
        while (iterator.hasNext()) {
            String patientName = iterator.next();
            System.out.println(patientName);
        }
        // Remove a specific patient from the HashSet
        patientSet.remove("Amit Kumar");
        System.out.println("After removing 'Amit Kumar': " + patientSet);

        // Create another HashSet to store additional Indian patients
        HashSet<String> additionalPatients = new HashSet<String>();
        additionalPatients.add("Kavita Reddy");
        additionalPatients.add("Vikram Mehta");

        // Add the additional Indian patients to the main patientSet
        patientSet.addAll(additionalPatients);
        System.out.println("Updated List of Indian patients in the hospital: " + patientSet);

        // Remove all the new Indian patients from the HashSet
        patientSet.removeAll(additionalPatients);
        System.out.println("After removing additional Indian patients: " + patientSet);

        // Clear the HashSet to remove all patients
        patientSet.clear();
        System.out.println("After clearing the HashSet: " + patientSet);
    }
}