
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
}
