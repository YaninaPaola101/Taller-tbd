
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.DisciplinaModel;





public class DisciplinaDao {
    public static ArrayList<DisciplinaModel> getAllDisciplina() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from disciplina";
        ArrayList disciplinaResponse = new ArrayList<DisciplinaModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) { // rs --- lista ... iterar 
                DisciplinaModel dis = new DisciplinaModel(rs.getString("nombre"));
                dis.setId(rs.getInt("id_disciplina"));
                disciplinaResponse.add(dis);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinaResponse;
    }
    
    public static void insertarDisciplina(DisciplinaModel disciplina){
        Connection c = DatabaseConnection.getConnection();
        String query = "insert into disciplina(nombre) values(?)";
        System.out.println(query);
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setString(1, disciplina.getDisciplina());
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
    
    public  ArrayList<DisciplinaModel> listarDisciplina() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from disciplina" ;
                        
        System.out.println(query);
        ArrayList listarDisciplina = new ArrayList<DisciplinaModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                DisciplinaModel dis = new DisciplinaModel();
                dis.setId(rs.getInt(1));
                dis.setDisciplina(rs.getString(2));
                listarDisciplina.add(dis);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listarDisciplina;
    }
}
