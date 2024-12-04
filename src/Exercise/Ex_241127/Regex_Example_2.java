/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241127;

import java.util.ArrayList;
import java.util.regex.*;

/**
 *
 * @author Admin
 */
public class Regex_Example_2 {
    public static void main(String[] args) {
        String regexChar = "\\D+";
        String regexNo = "\\d+";
        String input = "Apple123Banana456Orange789";
        
        Pattern patChar = Pattern.compile(regexChar);
        Pattern patNo = Pattern.compile(regexNo);
        Matcher matchChar = patChar.matcher(input);
        Matcher matchNo = patNo.matcher(input);
        
        ArrayList<String> outputChars = new ArrayList<>();
        ArrayList<String> outputNos = new ArrayList<>();
        
        while (matchChar.find()) {
            outputChars.add(matchChar.group());
        }
        while (matchNo.find()) {
            outputNos.add(matchNo.group());
        }
        
        System.out.println("String character: " + String.join(" ", outputChars));
        System.out.println("String number: " + String.join(" ", outputNos));
    }
}
