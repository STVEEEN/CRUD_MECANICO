/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class ClaseConexion {
    
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USUARIO = "SYSTEM";
    private static final String CONTRASENA = "ITR2024";

    public static Connection getConexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la clase del driver: " + ex.getMessage());
            return null;
        }
    }
    
}
