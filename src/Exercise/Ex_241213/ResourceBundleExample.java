/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241213;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // Đặt ngôn ngữ hiện tại (ví dụ: tiếng Anh)
        Locale localeEn = new Locale("en");
        ResourceBundle bundleEn = ResourceBundle.getBundle("Exercise.Ex_241213.messages", localeEn);
        
        // Đặt ngôn ngữ hiện tại (ví dụ: tiếng Việt)
        Locale localeVi = new Locale("vi");
        ResourceBundle bundleVi = ResourceBundle.getBundle("Exercise.Ex_241213.messages", localeVi);
        
        // In ra các thông điệp theo từng ngôn ngữ
        System.out.println("English:");
        System.out.println(bundleEn.getString("greeting"));
        System.out.println(bundleEn.getString("farewell"));
        System.out.println(bundleEn.getString("inquiry"));

        System.out.println("\nVietnamese:");
        System.out.println(bundleVi.getString("greeting"));
        System.out.println(bundleVi.getString("farewell"));
        System.out.println(bundleVi.getString("inquiry"));
    }
}
