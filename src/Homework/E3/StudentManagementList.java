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
    int rollNo;
    
    public Student(int rollNo, String name, int age, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    
    @Override
    public String toString() {
        return "Roll Number: " + rollNo + " - Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class StudentManagementList {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
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
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }
    
    //Method Add Student
    public static void addStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        for (Student student : studentList) {
            if (student.rollNo == rollNo) {
                System.out.println("Student with roll number: " + rollNo + " already exist.");
                return;
            }
        }
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Mark: ");
        double mark = scanner.nextDouble();
        
        Student student = new Student(rollNo, name, age, mark);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }
    
    //Method Update Student
    public static void updateStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        Student studentUpdate = null;
        for (Student student : studentList) {
            if (student.rollNo == rollNo) {
                studentUpdate = student;
                break;
            }
        }
        
        if (studentUpdate == null) {
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
        
        studentUpdate.name = name;
        studentUpdate.age = age;
        studentUpdate.mark = mark;
        System.out.println("Student updated successfully.");
    }
    
    //Method Delete Student
    public static void deleteStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        Student studentDelete = null;
        for (Student student : studentList) {
            if (student.rollNo == rollNo) {
                studentDelete = student;
                break;
            }
        }
        
        if (studentDelete == null) {
            System.out.println("Student with roll number: " + rollNo + " not found.");
            return;
        }
        
        studentList.remove(studentDelete);
        System.out.println("Student deleted successfully.");
    }
    
    //Method Search Student
    public static void searchStudent() {
        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        
        Student studentSearch = null;
        for (Student student : studentList) {
            if (student.rollNo == rollNo) {
                studentSearch = student;
                break;
            }
        }
        
        if (studentSearch == null) {
            System.out.println("Student with roll number: " + rollNo + " not found.");
            return;
        }
        
        System.out.println("Student found: ");
        System.out.println(studentSearch);
    }
    
    //Method Display All Students
    public static void displayStudents() {
        if(studentList.isEmpty()) {
            System.out.println("No student avaiable.");
            return;
        }
        
        System.out.println("List Of All Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
