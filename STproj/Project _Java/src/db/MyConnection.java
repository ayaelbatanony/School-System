/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class MyConnection {
    public static Connection getConnection()
    {
       Connection con = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root","");
          } catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
          }
           return con;
    }
}
    
            
            
    

