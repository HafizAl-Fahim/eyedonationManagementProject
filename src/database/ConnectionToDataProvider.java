/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author fahim
 */
public class ConnectionToDataProvider {
    
     public static void main (String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://127.0.0.1:3306/eyemanagementbd?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url, user, password);
        Statement statement = con.createStatement();
       
        
        statement.close();
        con.close();
    }   

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}