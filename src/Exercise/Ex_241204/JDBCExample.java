/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241204;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class JDBCExample {
    public static void main(String[] args) {         
        String url = "jdbc:mysql://localhost:3306/test_jdbc";
        String user = "root";
        String password = "";
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connect successfully");
            
            String sql = "SELECT * FROM users";
            try (Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    System.out.println("User ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
