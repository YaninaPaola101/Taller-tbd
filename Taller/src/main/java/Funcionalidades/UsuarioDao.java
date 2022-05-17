
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.RolModel;
import model.UsuarioModel;



public class UsuarioDao {

    public static void modificarDatos(int fila, int id, String nombre, String edad, String activo, String rol) {
        Connection c = DatabaseConnection.getConnection();
        String query = "UPDATE public.usuario\n" +
                        "SET nombre= ?, edad=? , activo=?\n" +
                        "where id_usuario = ?;";
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, Integer.parseInt(edad));
            pstmt.setBoolean(3, activo.equals("true"));
            pstmt.setInt(4, id);
            pstmt.executeQuery();
            System.err.println(pstmt.toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"No se logro modificar");
        }
    }
    
    public  ArrayList<UsuarioModel> listarUsuarios() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select u.id_usuario, u.nombre, u.edad, u.activo, r.nombre from usuario u, rol r, Usuario_Rol ur\n" +
                        "where r.id_rol = ur.id_rol and u.id_usuario = ur.id_usuario;";
        System.out.println(query);
        ArrayList listarUsuarios = new ArrayList<UsuarioModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                UsuarioModel usu = new UsuarioModel();
                usu.setId(rs.getInt(1));
                usu.setNombreUsuario(rs.getString(2));
                usu.setEdad(rs.getInt(3));
                usu.setActivo(rs.getBoolean(4));
                usu.setRol(rs.getString(5));
                listarUsuarios.add(usu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listarUsuarios;
    }
    
}
