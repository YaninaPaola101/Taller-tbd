
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RegistroFun {
    DatabaseConnection cn = new DatabaseConnection();
    Connection con;
    PreparedStatement ps;
    private ResultSet rs;
   public boolean RegistrarCliente(Registro re){
       String sql = "INSERT INTO Usuario(nombre, edad, activo) VALUES (?, ?, ?)";
       try {
           
           ps = con.prepareStatement(sql);
           ps.setString(1, re.getNombreUsuario());
           ps.setInt(2, re.getEdad());
           ps.setBoolean(3, re.isActivo());
           ps.execute();
           return true;
         } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
}
