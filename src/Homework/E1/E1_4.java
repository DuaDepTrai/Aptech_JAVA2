/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E1;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author DUADEPTRAI
 */
public class E1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String regex = "[A-Z][a-z]";
        System.out.print("Enter string to check: ");
        String input = scanner.nextLine();
        
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(input);
        
        if (matcher.find()) {
            System.out.println("'" + input + "' valid");
        } else {
            System.out.println("'" + input + "' invalid");
        }
    }
}