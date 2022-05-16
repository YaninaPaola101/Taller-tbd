
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.PlanModel;
import model.RolModel;


public class SuscripcionDao {
    
    public static void insertarSuscripcion(int id, String plan){
        Connection c = DatabaseConnection.getConnection();
        String query = "INSERT INTO public.renovar(id_renovar, plan)\n" +
                        "VALUES (?, ?);";
        System.out.println(query);
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, plan);
            pstmt = c.prepareStatement(pstmt.toString());
            System.out.println(pstmt.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
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
        }
        return planResponse;
    }
}
