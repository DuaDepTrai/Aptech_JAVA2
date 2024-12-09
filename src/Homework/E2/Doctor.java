/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E2;

/**
 *
 * @author DUADEPTRAI
 */
public class Doctor {
    private String doctorId;
    private String name;
    private String specialty;
    private double hourExam;
    
    public Doctor() {}
    
    public Doctor(String doctorId, String name, String specialty, double hourExam) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.hourExam = hourExam;
    }
    
    //getter
    public String getDoctorId() {
        return doctorId;
    }
    public String getName() {
        return name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public double getHourExam() {
        return hourExam;
    }
    
    //setter
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setHourExem(double hourExam) {
        this.hourExam = hourExam;
    }
    
    //Override
    @Override
    public String toString() {
        return "Doctor ID: " + doctorId + "\nName: " + name 
                + "\nSpecialty: " + specialty + "\nHour Exam: " + hourExam;
    }
}
