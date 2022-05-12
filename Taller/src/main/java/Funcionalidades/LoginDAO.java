
package Funcionalidades;


import java.net.InetAddress;
import java.net.UnknownHostException;
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
        String query = "SELECT * FROM public.usuario" +
                " where nombre='" + login.usuario + "'" +
                " and contrasenia='" + login.contrasenia + "'";
        LoginModel loginResponse = null;
        try {
            System.out.println(query);
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                loginResponse = new LoginModel(rs.getString("nombre"),
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
    
    public static void guardarSesion(){
        DatabaseConnection.closeConnection();
        DatabaseConnection.openConnection();
        int pid = LoginDAO.getPID();
        DatabaseConnection.setPID(pid);
        Connection c = DatabaseConnection.getConnection();
        InetAddress ip = getIp();
        
        String query = "INSERT INTO public.sesion(ip,pid) " +
                "values ('" + ip.getHostAddress() + "','" + pid + "')";
        System.out.println(query);
        try {
            PreparedStatement pstmt;
            pstmt = c.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            
        }        
    }
    private static InetAddress getIp(){
        InetAddress ip = null;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
        } catch (UnknownHostException e) { 
            e.printStackTrace();
        } finally{
            return ip;
        }
    } 
}
