
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DisciplinaModel;
import model.InstructorModel;
import model.RolModel;
import model.UsuarioModel;
import model.UsuarioRolModel;


public class InstructorDao {
    
    public static ArrayList<InstructorModel> getAllInstructor() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from instructor";
        ArrayList instructorResponse = new ArrayList<InstructorModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) { // rs --- lista ... iterar 
                InstructorModel ins = new InstructorModel(rs.getInt("instructor"), rs.getString("nombre"));
                instructorResponse.add(ins);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return instructorResponse;
    }
    
    public  ArrayList<UsuarioModel> listaInstructor() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from instructor";
        System.out.println(query);
        ArrayList listInstructor = new ArrayList<UsuarioModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                UsuarioModel usu = new UsuarioModel();
                usu.setId(rs.getInt(1));
                usu.setNombreUsuario(rs.getString(2));
                listInstructor.add(usu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return listInstructor;
    }
    
    public static void insertarInstructor(int idUsuario, String nombre){
        Connection c = DatabaseConnection.getConnection();
        String query = "INSERT INTO instructor(instructor, nombre)\n" +
                        "VALUES (?, ?);";
        System.out.println(query);
        
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setInt(1, idUsuario);  
            pstmt.setString(2, nombre);
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
    }
    
    
    
}
