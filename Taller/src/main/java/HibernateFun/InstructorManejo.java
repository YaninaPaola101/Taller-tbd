
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.InstructorModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class InstructorManejo {
    private static File f = new File("hibernate.cfg.xml");
    public static List<InstructorModel> actualizarLista() {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(InstructorModel.class).buildSessionFactory();
        Session session = sf.openSession();
        List lista = new ArrayList<InstructorModel>(); 
         try {
             session.beginTransaction();
             lista = session.createCriteria(InstructorModel.class).list();
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
