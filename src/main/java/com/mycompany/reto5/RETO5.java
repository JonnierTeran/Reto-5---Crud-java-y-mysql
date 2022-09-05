/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto5;

import java.sql.SQLException;
import javax.swing.JOptionPane;



public class RETO5 {

    public static void main(String[] args) throws SQLException {
       JOptionPane.showMessageDialog(null, "BIENVENIDO AL DATABASE ADMINISTRATOR \n ------------------ M Y S Q L ---------------------------  ");
        new Conectar().setVisible(true);
   
    }
}
