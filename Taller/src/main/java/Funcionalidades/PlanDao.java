
package Funcionalidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
            query = pstmt.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
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
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return listPlan;
    }
    public static void modificarPlan(int fila, int id, String nombre, int meses, int costo) {
        Connection c = DatabaseConnection.getConnection();
        String query = "UPDATE public.plan\n" +
                        "SET nombre= ?, meses=? , costo=?\n" +
                        "where id_plan = ?;";
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, meses);
            pstmt.setInt(3, costo);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            System.err.println(pstmt.toString());
            query = pstmt.toString();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e+"No se logro modificar");
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
    }
}
