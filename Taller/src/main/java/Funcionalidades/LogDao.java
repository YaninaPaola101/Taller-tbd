package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.LoginModel;
import model.Sesion;


public class LogDao {
      
    public static void insertarLog(LoginModel login, Sesion sesion,String queryTexto){
        /*Connection c = DatabaseConnection.getConnection();
        String query = """
                        INSERT INTO public.log(
                      	id_usuario, id_sesion, "queryTexto")
                      	VALUES (?, ?, ?);
                       """;
        System.out.println(query);
        
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            
            pstmt.setInt(1, login.getId());
            pstmt.setInt(2, sesion.getIdSesion());
            pstmt.setString(3, queryTexto);
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        */
    }
    
}
