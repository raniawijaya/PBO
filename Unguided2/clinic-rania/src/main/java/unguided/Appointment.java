/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author rania
 */
import java.time.LocalDateTime;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime appointmentDate;

    // Constructor
    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    // Getter dan Setter
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    // toString untuk cetak info janji temu
    @Override
    public String toString() {
        return "Appointment Details:\n" +
               "Date: " + appointmentDate + "\n\nDoctor:\n" + doctor + "\n\nPatient:\n" + patient;
    }
}