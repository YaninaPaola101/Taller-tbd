
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class LoginManejo {
    private static File f = new File("hibernate.cfg.xml");
    public static List<UsuarioModel> getListaUsuarios() {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
        Session session = sf.openSession();
        List lista = new ArrayList<UsuarioModel>(); 
         try {
             session.beginTransaction();
             lista = session.createCriteria(UsuarioModel.class).list();
             session.getTransaction().commit();
             System.out.println("Muestra exitosa");
         } catch(Exception e){
             e.printStackTrace();
         }
         finally {
             session.close();
         }
        return lista;
     }
}
