
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.HorarioModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HorarioManejo {
    private static File f = new File("hibernate.cfg.xml");
    public static List<HorarioModel> actualizarLista() {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(HorarioModel.class).buildSessionFactory();
        Session session = sf.openSession();
        List lista = new ArrayList<HorarioModel>(); 
         try {
             session.beginTransaction();
             lista = session.createCriteria(HorarioModel.class).list();
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
