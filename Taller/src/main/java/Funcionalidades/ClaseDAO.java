/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ClaseDAO {
    
    public static void insertarClase(String ini, String fin,int idDisciplina,int idUsuario){
        Connection c = DatabaseConnection.getConnection();
        String query = """
                      insert into clase(hora_inicio,hora_fin,id_disciplina,id_usuario) 
                      values(?,?,?,?)
                       """;
        System.out.println(query);
        
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            
            pstmt.setString(1, ini);
            pstmt.setString(2, fin);
            pstmt.setInt(3, idDisciplina);
            pstmt.setInt(4, idUsuario);
            pstmt = c.prepareStatement(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
    }
    
}
