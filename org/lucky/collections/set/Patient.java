package org.lucky.collections.set;

import java.util.HashSet;

public class Patient {
    int patientId;
    String name;
    HashSet<Appointment> appointments;

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.appointments = new HashSet<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}