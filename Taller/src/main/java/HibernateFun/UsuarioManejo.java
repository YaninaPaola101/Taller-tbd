
package HibernateFun;

import java.io.File;
import model.UsuarioModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class UsuarioManejo {
    private static File f = new File("hibernate.cfg.xml");
     public static void eliminarUsuario(UsuarioModel usu) {
        SessionFactory sf =  new AnnotationConfiguration().configure(f).addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
        Session session = sf.openSession();
         try {
             session.beginTransaction();
             session.delete(usu);
             session.getTransaction().commit();
             System.out.println("Usuario eliminado de la Base de datos");
             session.close();
             
         } finally {
             session.close();
         }
     }
     
     // Este es el q probe , y funciona 100 %
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
//         SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
//         Session session = factory.openSession();
//         try {
//             session.beginTransaction();
//             
//             session.save(usu);
//             session.getTransaction().commit();
//             System.out.println("Usuario modificado en la Base de datos");
//             session.close();
//             
//         } finally {
//             factory.close();
//         }
         
     }
}