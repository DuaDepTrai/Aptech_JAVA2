/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241225;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter language ('en' for English, 'vi' for Vietnamese): ");
        String langCode = scanner.nextLine();
        
        Locale locale;
        
        if (langCode.equalsIgnoreCase("vi")) {
            locale = new Locale("vi", "VN");
        } else {
            locale = new Locale("en", "US");
        }
        
        ResourceBundle bundle = ResourceBundle.getBundle("Exercise.Ex_241225.lang", locale);
        
        String name = "Laptop ASUS ROG";
        String dateRelease = "15-03-2024";
        double price = 45000.75;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(bundle.getString("date.format"), locale);
        String formattedDate = dateFormat.format(parseDate(dateRelease));
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        if (locale.getLanguage().equals("vi")) {
            currencyFormat.setMaximumFractionDigits(2);
        }
        String formattedPrice = currencyFormat.format(price);
        
        System.out.println(bundle.getString("name") + name);
        System.out.println(bundle.getString("dateRelease") + formattedDate);
        System.out.println(bundle.getString("price") + formattedPrice);
        
        scanner.close();
    }
    
    private static java.util.Date parseDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return dateFormat.parse(date);
        } catch (Exception e) {
            return null;
        }
    }
}
