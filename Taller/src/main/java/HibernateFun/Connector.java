
package HibernateFun;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connector {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5433/TallerBaseDatos";
        String user = "postgres"; //maestro
        String pass = "psql";
        try{
            System.out.println("Intentando conectar con la BD" + url);
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
