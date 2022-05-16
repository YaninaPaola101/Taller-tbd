
package Funcionalidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.InstructorModel;
import model.RolModel;
import model.UsuarioModel;
import model.UsuarioRolModel;


public class InstructorDao {
    
    public  ArrayList<UsuarioModel> listaInstructor() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select u.nombre, r.nombre from usuario u, rol r, Usuario_Rol ur\n" +
                       "where r.id_rol = ur.id_rol and u.id_usuario = ur.id_usuario and r.nombre = 'Instructor';";
        ArrayList listInstructor = new ArrayList<UsuarioModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                UsuarioModel usu = new UsuarioModel();
                usu.setNombreUsuario(rs.getString(1));
                usu.setRol(rs.getString(2));
                listInstructor.add(usu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listInstructor;
    }
}
