/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "1234";
    
    public static Connection conectar(){
        try{
            Connection conexion = DriverManager.getConnection(
            URL,
            USUARIO,
            CONTRASENA
            );
            
            System.out.println("Conexion exitosa");
            return conexion;
        }catch (SQLException e){
            System.out.println("Error al conectar con MySQL");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
