/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.sysytem;

/**
 *
 * @author Ashish Katare
 */

import java.sql.*;

public class Conn {
    
   Connection c;
   Statement s;
   
    public Conn(){
        
    try{
        c = DriverManager.getConnection(" jdbc:mysql://localhost:3306/bankmanagementsystem1 ", "root", "rishabh");
        s = c.createStatement();
    }
     catch (Exception e){
    System.out.println(e);
}
    }
}
    
