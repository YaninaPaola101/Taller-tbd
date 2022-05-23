/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.RolModel;


public class PermisosDao {
    
    public static ArrayList<String> getPermisos(String nombre) {
        Connection c = DatabaseConnection.getConnection();
        String query = """
                       select fi.nombre
                       from usuario u, usuario_rol ur, rol r, (select r.id_rol,f.id_funcion,f.nombre from rol r, funcion f, rol_funcion rf		
                                                                where r.id_rol = rf.id_rol  
                                                                and f.id_funcion  = rf.id_funcion ) rf,
                                                                (select iu.nombre, f.id_funcion from iu, funcion f ,funcion_iu fi
                                                                where iu.id_iu = fi.id_iu  and fi.id_funcion = f.id_funcion) fi
                       where u.id_usuario = ur.id_usuario 
                       		and  ur.id_rol = r.id_rol 
                       		and u.nombre = ?
                       			and r.id_rol = rf.id_rol
                       			and rf.id_funcion = fi.id_funcion
                       										   
                       										  
                       """;
        ArrayList permisosResponse = new ArrayList<String>();
        try {
            PreparedStatement psmt = c.prepareStatement(query);
            psmt.setString(1, nombre);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) { // rs --- lista ... iterar 
                permisosResponse.add(rs.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return permisosResponse;
    }
    
}
