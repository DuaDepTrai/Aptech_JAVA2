/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E16;

import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class AICourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter language ('en' for English, 'vi' for Vietnamese): ");
        String langCode = scanner.nextLine();
        
        try {
            Locale locale = new Locale(langCode);
            
            ResourceBundle bundle = ResourceBundle.getBundle("Homework.E16.messages", locale);
            
            System.out.println(bundle.getString("title"));
            System.out.println(bundle.getString("date"));
            System.out.println(bundle.getString("cost"));
        } catch (Exception e) {
            System.out.println("Language not supported or missing resourse files.");
        }
        
        scanner.close();
    }
}
