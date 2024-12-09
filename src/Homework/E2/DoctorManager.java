/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author DUADEPTRAI
 */
public class DoctorManager {
    //Hashmap
    private HashMap<String, Doctor> doctorMap;
    
    public DoctorManager() {
        doctorMap = new HashMap<>();
    }
    
    //Add doctor method
    public void addDoctor() {
        Scanner scanner = new Scanner(System.in);
        
        //doctorId
        String doctorId = null;
        boolean validId = false;
        while (!validId) {
            System.out.print("Enter Doctor ID (format: Bxxxx): ");
            doctorId = scanner.nextLine();
            if (isValidDoctorId(doctorId)) {
                if(doctorMap.containsKey(doctorId)) {
                    System.out.println("Doctor ID already exist. Please try other ID.");
                } else {
                    validId = true;
                }
            } else {
                System.out.println("Invalid Doctor ID format. Please try again!");
            }
        }
        
        //name
        String name;
        do {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Name cannot be null.");
            }
        } while (name.isEmpty());
        
        //specialty
        String specialty;
        do {
            System.out.print("Enter specialty: ");
            specialty = scanner.nextLine();
            if (specialty.isEmpty()) {
                System.out.println("Specialty cannot be null.");
            }
        } while (specialty.isEmpty());
        
        //hourExam
        double hourExam;
        while (true) {
            System.out.print("Enter Hour Exam (must be > 0): ");
            hourExam = scanner.nextDouble();
            if (hourExam > 0) {
                break;
            } else {
                System.out.println("Hour Exam must be > 0");
            }
        }
        
        //add Doctor
        Doctor doctor = new Doctor(doctorId, name, specialty, hourExam);
        doctorMap.put(doctorId, doctor);
        System.out.println("Doctor added successfully!");
    }
    
    //Search by ID
    public void search(String id) {
        if (doctorMap.containsKey(id)) {
            System.out.println("Doctor found: ");
            System.out.println(doctorMap.get(id).toString());
        } else {
            System.out.println("No doctor found with ID: " + id);
        }
    }
    
    //Check valid doctorId input
    private boolean isValidDoctorId(String doctorId) {
        String regex = "^B\\d{4}$";
        return Pattern.matches(regex, doctorId);
    }
    
    //menu
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n=== DOCTOR MANAGER ===");
            System.out.println("1. Add new doctor");
            System.out.println("2. Search doctor");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    System.out.print("Enter Doctor ID to search: ");
                    String id = scanner.nextLine();
                    search(id);
                    break;
                case 3:
                    System.out.println("EXIT!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    
    //main
    public static void main(String[] args) {
        DoctorManager manager = new DoctorManager();
        manager.menu();
    }
}
