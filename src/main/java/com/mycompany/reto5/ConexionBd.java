/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author jonnier andres teran
 */
public class ConexionBd {

     private Connection conec;
     private String host;
     private String Bd;
     private String user;
     private String Pass;

    public ConexionBd() {
        this.conec = null;
        this.host = "localhost";
        this.Bd = "Reto4";
        this.user = "root";
        this.Pass = "root";
    }
     
     public Connection Conectar(){
         
         try {
             Class.forName("com.mysql.jdbc.Driver");
             
             conec = DriverManager.getConnection("jdbc:mysql://" + host + "/" + Bd, user, Pass);
             
             JOptionPane.showMessageDialog(null,"LA CONEXION CON LA BASE DE DATOS " + Bd + " FUE ESTABLECIDA EXITOSAMENTE!");
             
             new Options().setVisible(true);// si la conexion es exitosa abre la ventana de las tablas
             
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, "ADVERTENCIA, ERROR AL CARGAR LA BASE DE DATOS, REVISE DETALLADAMENTE LOS DATOS INGRESADOS, \n ERROR: " + e , "ERROR DE VALIDACION", JOptionPane.WARNING_MESSAGE);
              
             // si la conexion falla se repite el proceso de coneccion a mysql server
              new Conectar().setVisible(false);
              new Conectar().setVisible(true);
              JOptionPane.showMessageDialog(null, "REVISAR LOS PARAMETROS DE LA CONEXION, EN LA CLASE CONEXIONBD", "ERROR DE VALIDACION", JOptionPane.WARNING_MESSAGE);
         }
         
         return conec;
     }
}