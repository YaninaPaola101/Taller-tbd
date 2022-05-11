
package Funcionalidades;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
    
    public static boolean insertarLogin(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = "INSERT INTO public.\"Login\"(usuario,contrasenia) " +
                "values ('" + login.usuario + "','" + login.contrasenia + "')";
        System.out.println(query);
        try {
            PreparedStatement pstmt;
            pstmt = c.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public static int getPID() {
        Connection c = DatabaseConnection.getConnection();
        String query = "select pg_backend_pid()";
        int pid = -1;
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                pid = rs.getInt("pg_backend_pid");
                                        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pid;
    }

    public static LoginModel getLogin(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = "SELECT * FROM public.\"Login\"" +
                " where usuario='" + login.usuario + "'" +
                " and contrasenia='" + login.contrasenia + "'";
        LoginModel loginResponse = null;
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                loginResponse = new LoginModel(rs.getString("usuario"),
                                        rs.getString("contrasenia"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginResponse;
    }

    public static boolean insertarLoginStoreProcedures(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = "CALL insertar_login('" + login.usuario + "','" + login.contrasenia + "')";
        System.out.println(query);
        try {
            PreparedStatement pstmt;
            pstmt = c.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static LoginModel getLoginStoredProcedures(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = "CALL buscar_login('" + login.usuario + "','" + login.contrasenia + "')";
        LoginModel loginResponse = null;
        System.out.println(query);
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                loginResponse = new LoginModel(rs.getString("usuario"),
                        rs.getString("contrasenia"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginResponse;
    }

}
