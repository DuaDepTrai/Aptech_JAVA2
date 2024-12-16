/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241213;
import java.util.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter language code ('en' for English, 'vi' for Vietnamese): ");
        String langCode = scanner.nextLine().trim();
        
        try {
            Locale userLocale = new Locale(langCode);
            
            ResourceBundle bundle = ResourceBundle.getBundle("Exercise.Ex_241213.messages", userLocale);
            
            System.out.println("Messages in " + langCode + ": ");
            System.out.println(bundle.getString("greeting"));
            System.out.println(bundle.getString("farewell"));
            System.out.println(bundle.getString("inquiry"));
        } catch (Exception e) {
            System.out.println("Language not supported or missing resource files.");
        }
        
        scanner.close();
    }
}
