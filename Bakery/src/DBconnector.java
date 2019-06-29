/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachini Ayeshika
 */
import java.sql.Connection;
import java.sql.DriverManager;
        
public class DBconnector {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");
        return con;
        
    }
    
}
