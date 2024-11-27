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
public class Regex_Example {
    public static void main(String[] args) {
        //Mẫu Regex
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        String input = "My number is 123-45-6789";
        
        //Tạo patern và Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        //Kiểm tra khớp mẫu
        if (matcher.find()) {
            System.out.println("Found a match " + matcher.group());
        } else {
            System.out.println("No match found");
        }
    }
}
