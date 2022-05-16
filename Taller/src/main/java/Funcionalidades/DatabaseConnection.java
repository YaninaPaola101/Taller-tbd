
package Funcionalidades;


import java.sql.Connection;
import java.sql.DriverManager;
import model.LoginModel;

public class DatabaseConnection {
    private static Connection con = null;
    private static int pid = -1;
    public static LoginModel loginModel;
    static
    {
        initConnector();
    }
    private static void initConnector(){
        String url = "jdbc:postgresql://localhost:5433/Taller";
        String user = "postgres"; //maestro
        String pass = "psql";
        try {
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
    public static int getPID(){
        return pid;
    }
    public static void setPID(int value){
        pid = value;
    }
    public static void closeConnection()
    {
        try{
            con.close();
        } catch(Exception e ){
            e.printStackTrace();
        }
    }
     
    public static void openConnection()
    {
        try{
            initConnector();
        } catch(Exception e ){
            e.printStackTrace();
        }
    }

}
