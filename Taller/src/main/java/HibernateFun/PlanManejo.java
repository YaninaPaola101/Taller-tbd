
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.PlanModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class PlanManejo {
    private static File f = new File("hibernate.cfg.xml");
    public static List<PlanModel> actualizarLista() {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(PlanModel.class).buildSessionFactory();
        Session session = sf.openSession();
        List lista = new ArrayList<PlanModel>(); 
         try {
             session.beginTransaction();
             lista = session.createCriteria(PlanModel.class).list();
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
    public static void GuardarPlan(PlanModel plan) {
         SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").addAnnotatedClass(PlanModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();            
             session.save(plan);
             session.getTransaction().commit();
             System.out.println("plan guardado en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
    public static void modificarPlan(PlanModel plan) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(PlanModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.update(plan);
             session.getTransaction().commit();
             System.out.println("Plan modificado en la Base de datos");
         } catch(Exception e){
             e.printStackTrace();
         }
         finally {
             session.close();
         }
    }
}
