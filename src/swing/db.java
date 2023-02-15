/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Meshith
 */
public class db {
        public static Connection mycon(){
            Connection con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentalsoftware","root",""); 
                System.out.println("Connection Successful");
            }catch(Exception e){
                System.out.println("Connection Failed");
            System.out.println(e);
        }
            return con;
}
}
