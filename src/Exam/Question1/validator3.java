/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam.Question1;

/**
 *
 * @author DUADEPTRAI
 */
public class validator3 {
    public static boolean isValidPhone(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        
        String regex = "^0(9|8|7|5|3)\\d{8}$";
        
        return input.matches(regex);
    }
    
    public static void main(String[] args) {
        String [] phones = {
            "0981234567", "0912345678", "0312345678", "0512345678",
            "0712345678", "0812345678", "1234567890", "098123456",
            "09812345678", null, ""
        };
        
        for (String phone : phones) {
            System.out.print("The phone number " + phone);
            if (isValidPhone(phone)) {
                System.out.println(" is valid");
            } else {
                System.out.println(" isn't valid");
            }
        }
    }
}
