/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nist.pms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rishika Gupta
 */
public class displayimage {
     byte[] image;
    public static void fetchimage() throws ClassNotFoundException, SQLException{ 
      
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petmanagmentsystem", "root", "nitch24");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from  petmanagmentsystem.image");
                System.out.println("connecton"+stmt);
                while (rs.next()){
                    byte[] image = rs.getBytes("Picture");
                    System.out.println(image);
                }
                
    
          
        
       
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        displayimage.fetchimage();
    }
}