
package Funcionalidades;


import model.UsuarioRolModel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.LoginModel;
import model.PlanModel;
import model.Sesion;

public class LoginDAO {
    
    
    //INSERT INTO public.usuario(nombre, contrasenia, edad, activo) VALUES ('isabel', 'isabel', 7, true);
    
    public static boolean insertarUsuario(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = " INSERT INTO public.usuario(nombre, contrasenia, edad, activo) "
                + "VALUES ('" +login.getUsuario()+"','"+sha512(login.getContrasenia())+"',"+login.edad +","+true+")";
        System.out.println(query);
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
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
        System.out.println(query);
        LoginModel loginResponse = null;
        try {
            System.out.println(query);
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                loginResponse = new LoginModel(rs.getString("nombre"),
                                        rs.getString("contrasenia"),
                                        rs.getInt("edad"),
                                        rs.getBoolean("activo"));
                loginResponse.setId(rs.getInt("id_usuario"));
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

    public static int getLoginStoredProcedures(LoginModel login) {
        Connection c = DatabaseConnection.getConnection();
        String query = "CALL performLogin('" + login.usuario + "','" + sha512(login.contrasenia) + "')";
        int id = -1;
        System.out.println(query);
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                id = rs.getInt("user_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
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
        } finally {
            int idSesion = getIdSesion(ip.toString(), pid);
            DatabaseConnection.sesionModel = new Sesion(idSesion,ip.toString(),pid);
        }       
    }
    
    private static int  getIdSesion(String ip,int pid){
        Connection c = DatabaseConnection.getConnection();
        String query = "select id_sesion from sesion limit 1";
        int id = -1;
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    private static InetAddress getIp(){
        InetAddress ip = null;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (UnknownHostException e) { 
            e.printStackTrace();
        } finally{
            return ip;
        }
    } 
    
    public static UsuarioRolModel getRol(int idUsuario) {
        Connection c = DatabaseConnection.getConnection();
        String query = "select r.nombre nombreRol,ur.activo,ur.fecha_desde,ur.fecha_hasta,u.nombre nombreUsuario " + 
                       "from rol r, usuario_rol ur, usuario u " +
                       "where ? = ur.id_usuario " +
                        "and u.id_usuario = ur.id_usuario " +
                              "and r.id_rol = ur.id_rol";
        UsuarioRolModel rolResponse = null;
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setInt(1, idUsuario);
            ResultSet rs = pstmt.executeQuery();
            System.out.println(pstmt.toString());
            if (rs.next()) {
                rolResponse = new UsuarioRolModel(rs.getString("nombrerol"),
                                        rs.getString("nombreusuario"),
                                        rs.getBoolean("activo"),
                                        rs.getDate("fecha_desde"),
                                        rs.getDate("fecha_hasta"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rolResponse;
    }

    
    public static int getUserId(String nombre, String contrasenia) {
        Connection c = DatabaseConnection.getConnection();
        String query = "select id_usuario from usuario where nombre = ? and contrasenia = ?";
        System.out.println(query);
        int id = -1;
        try {
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setString(2, sha512(contrasenia));
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                id = rs.getInt("id_usuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return id;
    }
    
    public static String sha512(String contrasenia){
        StringBuilder sb = new StringBuilder();
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(contrasenia.getBytes());
            byte[] mb= md.digest();
            for(int i =0; i<mb.length; i++)
            {
                sb.append(Integer.toString((mb[i] & 0xff) * 0x100, 16).substring(1));
            }
        }
        catch(NoSuchAlgorithmException  Ex)
        {
            Ex.printStackTrace();
        }
        return sb.toString();
    }
}



