/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241126;

import java.util.regex.*;

/**
 *
 * @author ADMIN
 */
public class Regex_Example_2 {
    public static void main(String[] args) {
        //Mẫu regex
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String[] inputs = {"example@gmail.com", 
                            "test@domain", 
                            "hello@site.co.uk",
                            "invalid-email@.com",
                            "123@abc.org",
                            "a@b.c"};
        
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
