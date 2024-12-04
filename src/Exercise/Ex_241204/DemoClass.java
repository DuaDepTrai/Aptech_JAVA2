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
public class DemoClass {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "";
        int userid = 6;
        String username = "Dipali";
        String query = "insert into student values (?,?)";
        
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, userid);
        st.setString(2, username);
        int count = st.executeUpdate();
        
        System.out.println(count + " row/s affected");
        
        st.close();
        con.close();
    }
}
