/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241126;

import java.util.ArrayList;
import java.util.regex.*;

/**
 *
 * @author ADMIN
 */
public class Regex_Example_3 {
    public static void main(String[] args) {
        String regex = "-?\\d+(\\.\\d+)?";
        String input = "The temperatures are -3.5, 20, and 15 degrees today.";
        
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(input);
        
        ArrayList<String> numbers = new ArrayList<>();
        
        while (matcher.find()) {
            numbers.add(matcher.group());
        }
        
        if (numbers.size() != 0) {
            System.out.println("Numbers found: " + String.join(", ", numbers));
            System.out.println("Total count: " + numbers.size());
        }else {
            System.out.println("No number found");
        }
    }
}
