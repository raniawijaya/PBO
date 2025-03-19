/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author rania
 */
import java.util.HashMap;

public class DataChecker {
    // Count diagnoses
    private static HashMap<String, Integer> diagnosisCount = new HashMap<>();

    public static void registerDiagnosis(String diagnosis) {
        diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
    }

    public static void showDiagnosisStats() {
        System.out.println("Diagnosis Statistics:");
        for (String diag : diagnosisCount.keySet()) {
            System.out.println(diag + ": " + diagnosisCount.get(diag) + " cases");
        }
    }
}