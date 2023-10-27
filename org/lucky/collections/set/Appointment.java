package org.lucky.collections.set;

import java.util.Date;

class Appointment {
    int appointmentId;
    Doctor doctor;
    Date appointmentDate;

    public Appointment(int appointmentId, Doctor doctor, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }
}