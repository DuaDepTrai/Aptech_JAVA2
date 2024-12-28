/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E.Q4;

import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1. English");
        System.out.println("2. Vietnamese");
        System.out.print("Choose language: ");
        int pick = s.nextInt();
        s.nextLine();
        
        Locale locale;
        if(pick == 1){
            locale = new Locale("en", "US");
        } else {
            locale = new Locale("vi", "VN");
        }
        
        ResourceBundle bundle = ResourceBundle.getBundle("E.Q4.Messages", locale);
        
        String nm = "Nguyen Van Nam";
        String add = "Ha Noi";
        int blc = 2000000;
        
        System.out.println(bundle.getString("name") + ": " + nm);
        System.out.println(bundle.getString("address") + ": " + add);
        NumberFormat blcFormat = NumberFormat.getCurrencyInstance(locale);
        String formattedBlc = blcFormat.format(blc);
        System.out.println(bundle.getString("balance") + ": " + formattedBlc);
    }
}
