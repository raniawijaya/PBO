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

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Gree", "Cardiology", "DOC473");
        Patient pat = new Patient("Rania", 20, "Hypertension");

        Appointment appt = new Appointment(doc, pat, LocalDateTime.of(2025, 3, 20, 10, 30));

        System.out.println(appt);
    }
}