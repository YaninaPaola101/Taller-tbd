
package HibernateFun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModel;
import model.UsuarioRolModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class UsuarioManejo {
    private static File f = new File("hibernate.cfg.xml");
     public static void inhabilitarUsuario(UsuarioModel usu) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.update(usu);
             session.getTransaction().commit();
             System.out.println("Usuario inhabilitado de la Base de datos");
             
         } finally {
             session.close();
         }
     }
     
     public static void modificarUsuario(UsuarioModel usu) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.update(usu);
             session.getTransaction().commit();
             System.out.println("Usuario modificado en la Base de datos");
         } catch(Exception e){
             e.printStackTrace();
         }
         finally {
             session.close();
         }
         
     }
     public static void GuardarUsuario(UsuarioModel usu) {
         SessionFactory factory = new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();            
             session.save(usu);
             session.getTransaction().commit();
             System.out.println("Usuario modificado en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
     
    public static void GuardarUsuario(UsuarioRolModel usu) {
         SessionFactory factory = new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();            
             session.save(usu);
             session.getTransaction().commit();
             System.out.println("Usuario modificado en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
    }
    
     public static List<UsuarioModel> actualizarLista() {
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