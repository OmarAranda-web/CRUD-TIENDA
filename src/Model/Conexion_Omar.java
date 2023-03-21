/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author omara
 */
public class Conexion_Omar {
    public static final String URL= "jdbc:mysql://localhost:3306/omar_tiendita?autoReconnet=true&useSSL=false";
    public static final String USER="root";
    public static final String PASSWORD="";
    public Connection getConection(){
        java.sql.Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (java.sql.Connection)DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error Conexion: "+e);
        }
        return conexion;
    }
}
