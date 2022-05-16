
package Funcionalidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.RolModel;
import model.UsuarioModel;



public class UsuarioDao {
    
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
