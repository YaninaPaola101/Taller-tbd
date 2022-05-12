
package Funcionalidades;


public class LoginModel {
    public String usuario;
    public String contrasenia;
    public int id;
    public LoginModel(String usuario,String contrasenia,int id){
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
}
