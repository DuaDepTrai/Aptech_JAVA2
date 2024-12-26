/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241225_2;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Employee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter language ('en' for English, 'vi' for Vietnamese): ");
        String langCode = s.nextLine();
        
        Locale locale;
        if(langCode.equalsIgnoreCase("vi")) {
            locale = new Locale("vi", "VN");
        } else {
            locale = new Locale("en", "US");
        }
        
        ResourceBundle bundle = ResourceBundle.getBundle("Exercise.Ex_241225_2.lang", locale);
        
        String name = "Nguyen Van A";
        String position = "Developer";
        String dateJoined = "01-01-2022";
        double salary = 3000.50;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(bundle.getString("date.format"), locale);
        String formattedDate = dateFormat.format(parseDate(dateJoined));
                
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String formattedSalary = currencyFormat.format(salary);
        
        System.out.println(bundle.getString("name") + name);
        System.out.println(bundle.getString("position") + position);
        System.out.println(bundle.getString("dateJoined") + formattedDate);
        System.out.println(bundle.getString("salary") + formattedSalary);
        
        s.close();
    }
    
    public static java.util.Date parseDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return dateFormat.parse(date);
        } catch (Exception e) {
            return null;
        }
    }
}
