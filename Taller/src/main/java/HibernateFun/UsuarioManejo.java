
package HibernateFun;

import model.UsuarioModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsuarioManejo {
     public static void eliminarUsuario(UsuarioModel usu) {
         SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();
             session.delete(usu);
             session.getTransaction().commit();
             System.out.println("Usuario eliminado de la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
     public static void modificarUsuario(UsuarioModel usu) {
         SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
         Session session = factory.openSession();
         try {
             session.beginTransaction();
             
             session.update(usu);
             session.getTransaction().commit();
             System.out.println("Usuario modificado en la Base de datos");
             session.close();
             
         } finally {
             factory.close();
         }
         
     }
     public static void GuardarUsuario(UsuarioModel usu) {
         SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioModel.class).buildSessionFactory();
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
}