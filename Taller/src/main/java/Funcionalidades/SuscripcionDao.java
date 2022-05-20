
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import model.PlanModel;
import model.RolModel;


public class SuscripcionDao {
    
    public static void insertarSuscripcion(int idPlan, int idUsuario){
        Connection c = DatabaseConnection.getConnection();
        String query = "INSERT INTO public.renovar(id_plan, id_usuario)\n" +
                        "VALUES (?, ?);";
        System.out.println(query);
        
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setInt(1, idPlan);
            pstmt.setInt(2, idUsuario);
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
            query = pstmt.toString();
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        
    }
    
    public static ArrayList<PlanModel> getAllPlan() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select * from plan";
        ArrayList planResponse = new ArrayList<PlanModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) { 
                PlanModel plan = new PlanModel(rs.getString("nombre"), 0);
                planResponse.add(plan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return planResponse;
    }
}
