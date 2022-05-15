/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    
    
    public static void insertarUsuarioRol(boolean activo, int idRol,int idUsuario){
        Connection c = DatabaseConnection.getConnection();
        String query = "insert into usuario_rol(activo,fecha_desde,fecha_hasta,id_usuario,id_rol) values(?,?,?,?,?)";
        System.out.println(query);
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setBoolean(1, activo);
            pstmt.setDate(2, null);
            pstmt.setDate(3, null);
            pstmt.setInt(4, idUsuario);
            pstmt.setInt(5, idRol);
            pstmt = c.prepareStatement(query);
            pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
    }
}
