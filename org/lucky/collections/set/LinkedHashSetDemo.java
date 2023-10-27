package org.lucky.collections.set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Doctor> doctors = new LinkedHashSet<Doctor>();
        LinkedHashSet<Patient> patients = new LinkedHashSet<Patient>();

        // Creating Doctors
        Doctor doctor1 = new Doctor(101, "Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor(102, "Dr. Patel", "Pediatrician");
        Doctor doctor3 = new Doctor(103, "Dr. Lee", "Dermatologist");

        // Adding Doctors to LinkedHashSet
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        // Creating Patients
        Patient patient1 = new Patient(201, "John");
        Patient patient2 = new Patient(202, "Mary");

        // Creating Appointments
        Appointment appointment1 = new Appointment(301, doctor1, new Date());
        Appointment appointment2 = new Appointment(302, doctor2, new Date());
        Appointment appointment3 = new Appointment(303, doctor1, new Date());

        // Adding Appointments to Patients
        patient1.addAppointment(appointment1);
        patient1.addAppointment(appointment2);
        patient2.addAppointment(appointment3);

        // Adding Patients to LinkedHashSet
        patients.add(patient1);
        patients.add(patient2);

        // Traversing Doctors
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.id + " " + doctor.name + " " + doctor.specialization);
        }

        // Traversing Patients and their Appointments
        System.out.println("\nList of Patients and their Appointments:");
        for (Patient patient : patients) {
            System.out.println("Patient ID: " + patient.patientId + " Name: " + patient.name);
            System.out.println("Appointments:");
            for (Appointment appointment : patient.appointments) {
                System.out.println("Appointment ID: " + appointment.appointmentId +
                        " Doctor: " + appointment.doctor.name +
                        " Date: " + appointment.appointmentDate);
            }
            System.out.println();
        }
    }
}
