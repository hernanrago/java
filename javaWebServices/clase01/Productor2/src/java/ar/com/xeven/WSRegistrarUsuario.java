package ar.com.xeven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;

/**
 *
 * @author Pablo Acevedo
 */
@WebService
public class WSRegistrarUsuario {
    public String registrar(String nombre, String mail){
        boolean existe = false;
        Connection con = ConnectionHelper.getConnection();
        String sql = "SELECT * FROM alumnos";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("nombre").toLowerCase().equals(nombre))
                    existe = true;
            }
            if(existe)
                return "existe";
            else{
                sql = "INSERT INTO alumnos (nombre, mail) VALUES ('"+nombre+"', '"+mail+"')";
                stmt.executeUpdate(sql);
                return "ok";
            }
        } catch (SQLException ex) {
            return "error";
        }
    }
    public String login(String nombre, String password){
        Connection con = ConnectionHelper.getConnection();
        String sql = "SELECT * FROM alumnos WHERE nombre='"+nombre+"' AND password='"+password+"';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
                return "Bienvenido "+rs.getString("nombre");
            else
                return "No existe";
        } catch (SQLException ex) {
            return "Error SQL";
        }
    }
}
