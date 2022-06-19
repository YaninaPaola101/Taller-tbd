
package HibernateFun;

import model.SuscripcionModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SuscripcionManejo {
    public static void GuardarSuscripcion(SuscripcionModel sus) {
         SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").addAnnotatedClass(SuscripcionModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();            
             session.save(sus);
             session.getTransaction().commit();
             System.out.println("Suscripcion guardada en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
}
