
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
    public  ArrayList<PlanModel> listPlan() {
        Connection c = DatabaseConnection.getConnection();
        String query = "SELECT id_plan, nombre, costo, meses\n" +
                        "FROM public.plan;";
        ArrayList listPlan = new ArrayList<PlanModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                PlanModel pl = new PlanModel();
                pl.setId(rs.getInt(1));
                pl.setNombrePlan(rs.getString(2));
                pl.setCosto(rs.getInt(3));
                pl.setMeses(rs.getInt(4));
                listPlan.add(pl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPlan;
    }
}
