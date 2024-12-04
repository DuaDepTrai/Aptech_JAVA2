/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241127;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Admin
 */
public class Regex_Example_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        System.out.print("Enter email: ");
        String input = scanner.nextLine();
        
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(input);
        
        if (matcher.find()) {
            System.out.println(input + ": valid");
        } else {
            System.out.println(input + ": invalid");
        }
    }
}
