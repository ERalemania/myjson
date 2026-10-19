/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ERA-PC37
 */
public class ConexionTest {
    boolean a;
    public boolean inci() {
        String url = "jdbc:mysql://localhost:3306/eralemania";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(
                    url, usuario, contraseña
            );
            a = true;
            System.out.println("Conexión exitosa a MySQL");

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error de conexión:" + e);
            e.printStackTrace();
            a = false;
        }
        return a;
    }
}
