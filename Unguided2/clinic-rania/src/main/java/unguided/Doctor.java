/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author rania
 */
public class Doctor {
    private String name;
    private String specialization;
    private String doctorId;

    // Constructor
    public Doctor(String name, String specialization, String doctorId) {
        this.name = name;
        this.specialization = specialization;
        this.doctorId = doctorId;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    // toString untuk cetak data dokter
    @Override
    public String toString() {
        return "Doctor ID: " + doctorId + "\nName: " + name + "\nSpecialization: " + specialization;
    }
}