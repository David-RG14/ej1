/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basesita;

import java.sql.Connection;
import java.sql.SQLException;





public class Basesita {

    public static void main(String[] args) {
        System.out.println("Hola este es el nuevo comentario");
        try(Connection conexion = Conexion.conectar()){
            if(conexion != null){
                System.out.println("La base de datos esta disponible");
                
                ExampleQuery.ejecutarEjemplo();
            }
            
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexion");
            System.out.println(e.getMessage());
        }
    }
}
