/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author rania
 */
import java.util.UUID;

public class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private final String patientId;

    // Constructor
    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.setDiagnosis(diagnosis);
        this.patientId = UUID.randomUUID().toString();  // Generate unik ID
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        if (diagnosis != null && !diagnosis.trim().isEmpty()) {
            this.diagnosis = diagnosis;
        } else {
            this.diagnosis = "Unknown";
        }
    }

    public String getPatientId() {
        return patientId;
    }

    // toString untuk cetak data pasien
    @Override
    public String toString() {
        return "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age + "\nDiagnosis: " + diagnosis;
    }
}