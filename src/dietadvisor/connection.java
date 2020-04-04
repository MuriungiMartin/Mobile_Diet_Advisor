/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietadvisor;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class connection {
    public static Connection getConnection(){
    Connection con;
    con=null;
    try{
    String url="jdbc:mysql://localhost:3306/mobile_advisor";
    con=DriverManager.getConnection(url,"root","");
    if(con!=null){
    }
    else
    {
    JOptionPane.showMessageDialog(null,"ERROR");
    }
    
    }catch(Exception e){
    System.out.println("error: "+e);
    }
    return con;
    }
    
}
