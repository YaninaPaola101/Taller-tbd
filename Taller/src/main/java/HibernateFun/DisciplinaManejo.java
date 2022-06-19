
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.DisciplinaModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class DisciplinaManejo {
    private static File f = new File("hibernate.cfg.xml");
    public static List<DisciplinaModel> actualizarLista() {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(DisciplinaModel.class).buildSessionFactory();
        Session session = sf.openSession();
        List lista = new ArrayList<DisciplinaModel>(); 
         try {
             session.beginTransaction();
             lista = session.createCriteria(DisciplinaModel.class).list();
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
    public static void modificarDisciplina(DisciplinaModel dis) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(DisciplinaModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.update(dis);
             session.getTransaction().commit();
             System.out.println("Disciplina modificada en la Base de datos");
         } catch(Exception e){
             e.printStackTrace();
         }
         finally {
             session.close();
         }
        
     }
    public static void eliminarDisciplina(DisciplinaModel dis) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(DisciplinaModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.delete(dis);
             session.getTransaction().commit();
             System.out.println("Disciplina eliminada en la Base de datos");
         } catch(Exception e){
             e.printStackTrace();
         }
         finally {
             session.close();
         }
         
     }
    public static void GuardarDisciplina(DisciplinaModel dis) {
         SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").addAnnotatedClass(DisciplinaModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();            
             session.save(dis);
             session.getTransaction().commit();
             System.out.println("Disciplina guardada en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
}
