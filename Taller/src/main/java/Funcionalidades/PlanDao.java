
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.PlanModel;


public class PlanDao {
    
   public static boolean registrarPlan(PlanModel pl) {
        Connection c = DatabaseConnection.getConnection();
        String query = " INSERT INTO public.plan(nombre, costo, meses)\n" +
                        "VALUES (?, ?, ?);";
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setString(1, pl.getNombrePlan());
            pstmt.setInt(2, pl.getCosto());
            pstmt.setInt(3, pl.getMeses());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
