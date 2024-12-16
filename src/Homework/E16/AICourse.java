/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E16;

import java.util.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author DUADEPTRAI
 */
public class AICourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Nhập ngôn ngữ
        System.out.print("Enter language ('en' for English, 'vi' for Vietnamese): ");
        String langCode = scanner.nextLine();
        
        //Đặt locale
        Locale locale;

        if (langCode.equalsIgnoreCase("vi")) {
            locale = new Locale("vi", "VN");
        } else {
            locale = new Locale("en", "US");
        }

        //Load ResourceBundle
        ResourceBundle bundle = ResourceBundle.getBundle("Homework.E16.messages", locale);

        //Dữ liệu mẫu
        String title = bundle.getString("title");
        String date = "10-01-2024";
        double cost = 12000;
        
        //Định dạng ngày
        SimpleDateFormat dateFormat = new SimpleDateFormat(bundle.getString("date.format"), locale);
        String formattedDate = dateFormat.format(parseDate(date));
        
        //Định dạng tiền tệ
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String formattedCost = currencyFormat.format(cost);
        
        //Hiển thị thông tin
        System.out.println(bundle.getString("title"));
        System.out.println(bundle.getString("start.date") + ": " + formattedDate);
        System.out.println(bundle.getString("course.cost") + ": " + formattedCost);
        
        
        scanner.close();
    }
    
    //Chuyển chuỗi thành date
    private static java.util.Date parseDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return dateFormat.parse(date);
        } catch (Exception e) {
            return null;
        }
    }
}
