/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241127;

import java.util.regex.*;

/**
 *
 * @author Admin
 */
public class Regex_Example_3 {
    public static void main(String[] args) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z0-9]{8,20}$";
        String[] inputs = {"Password1",
                            "StrongPass123",
                            "password",
                            "PASSWORD",
                            "12345678",
                            "Pass123!",
                            "Strong",
                            "StrongPass123123123123"};
        
        Pattern pat = Pattern.compile(regex);
        for (String input : inputs) {
            Matcher matcher = pat.matcher(input);
            if (matcher.find()) {
                System.out.println(input + ": valid");
            } else {
                System.out.println(input + ": invalid");
            }
        }
    }
}
