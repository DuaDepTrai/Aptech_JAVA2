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
public class Regex_Example_4 {
    public static void main(String[] args) {
        String regex = "\\b[a-zA-Z]+(-[a-zA-Z]+)?\\b";
        String input = "This is a well-known example of regex usage.";
        
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(input);
        
        ArrayList<String> outputs = new ArrayList<>();
        
        while (matcher.find()) {
            outputs.add(matcher.group());
        }
        
        if (outputs.size() != 0) {
            System.out.println("Outputs: ");
            System.out.println(String.join("\n", outputs));
        } else {
            System.out.println("No word found");
        }
    }
}
