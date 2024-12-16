/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E3;

import java.util.*;

/**
 *
 * @author Admin
 */

class Student {
    String name;
    int age;
    double mark;
    
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class StudentManagementMap {
    private static final Map<Integer, Student> studentMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== STUDENT MANAGERMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> deleteStudent();
                case 4 -> searchStudent();
                case 5 -> displayStudents();
                case 6 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again");
            }
        }
    }
    
    //Method Add Student
    public static void addStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        if (studentMap.containsKey(rollNo)) {
            System.out.println("Student with roll number: " + rollNo + " already exist.");
            return;
        }
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Mark: ");
        double mark = scanner.nextDouble();
        
        Student student = new Student(name, age, mark);
        studentMap.put(rollNo, student);
        System.out.println("Student added successfully.");
    }
    
    //Method Update Student
    public static void updateStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        if (!studentMap.containsKey(rollNo)) {
            System.out.println("Student with roll number: " + rollNo + " not found.");
            return;
        }
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Mark: ");
        double mark = scanner.nextDouble();
        
        Student student = new Student(name, age, mark);
        studentMap.put(rollNo, student);
        System.out.println("Student updated successfully.");
    }
    
    //Method Delete Student
    public static void deleteStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        if (!studentMap.containsKey(rollNo)) {
            System.out.println("Student with roll number: " + rollNo + " not found.");
            return;
        }
        
        studentMap.remove(rollNo);
        System.out.println("Student deleted successfully.");
    }
    
    //Method Search Student
    public static void searchStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        if (!studentMap.containsKey(rollNo)) {
            System.out.println("Student with roll number: " + rollNo + " not found.");
            return;
        }
        
        System.out.println("Student found: ");
        System.out.println(studentMap.get(rollNo));
    }
    
    //Method Display All Students
    public static void displayStudents() {
        if(studentMap.isEmpty()) {
            System.out.println("No student avaiable.");
            return;
        }
        
        System.out.println("List Of All Students:");
        for (Map.Entry<Integer, Student> e : studentMap.entrySet()){
            System.out.println("Roll Number: " + e.getKey() + " - " + e.getValue());
        }
    }
}