/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.xeven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author educacionit
 */
public class ConnectionHelper {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                Runtime.getRuntime().addShutdownHook(new MyShDwnHook());
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/alumnos";
                String pwd = "admin";
                String usr = "root";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
            }
            return con;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("La conexión no pudo ser establecida con el driver.", e);
        } catch (SQLException e) {
            System.out.println("La conexión no pudo ser establecida con la base de datos. Reintentando.");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/eorders", "root", "");
            } catch (SQLException ex) {
                throw new RuntimeException("La conexión no pudo ser establecida con el driver.", ex);
            }
            return con;
        }
    }
    
    static class MyShDwnHook extends Thread {
        public void run() {
            try {
                Connection con = ConnectionHelper.getConnection();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error al cerrar la conexión", e);
            }
        }
    }
}
