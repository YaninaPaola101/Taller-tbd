
package model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "log")
public class LoginModel {
    public String contrasenia;
    public String usuario;
    public int id;
    public int edad;
    private String rol;
    public boolean activo;
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public LoginModel(String usuario,String contrasenia,int edad,boolean isActivo){
        
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.activo = isActivo;
        this.edad = edad;
    }
}
