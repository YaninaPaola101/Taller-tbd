
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.RolModel;


public class RolDao {
    public static ArrayList<RolModel> getAllRoles() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from rol";
        ArrayList rolesResponse = new ArrayList<RolModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) { // rs --- lista ... iterar 
                RolModel rol = new RolModel(rs.getInt("id_rol"), rs.getString("nombre"));
                rolesResponse.add(rol);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rolesResponse;
    }
    
    // modelo insert
    public static void insertarUsuarioRol(boolean activo, int idRol,int idUsuario){
        Connection c = DatabaseConnection.getConnection();
        String query = "insert into usuario_rol(activo,id_usuario,id_rol) values(?,?,?)";
        System.out.println(query);
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setBoolean(1, activo);
            pstmt.setInt(2, idUsuario);
            pstmt.setInt(3, idRol);
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
    }
}
