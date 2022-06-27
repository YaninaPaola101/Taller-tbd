
package model;

import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_usuario")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contrasenia",updatable=false)
    public String contrasenia;
    @Column(name = "edad")
    public int edad; 
    @Column(name = "activo")
    public boolean activo;
    @Column(name = "rol")
    public String rol;
    
    @OneToMany(mappedBy = "usuarioModel")
    public Set<UsuarioRolModel> usuarioRolModels;
   

    public UsuarioModel() {
    }

    public UsuarioModel(int id, String nombre, String contrasenia, int edad, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.edad = edad;
        this.activo = activo;
    }

    public UsuarioModel(int id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    

    public String getNombreUsuario() {
        return nombre;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombre = nombreUsuario;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "id=" + id + ", nombre=" + nombre + ", contrasenia=" + contrasenia + ", edad=" + edad + ", activo=" + activo + ", rol=" + rol + '}';
    }
    
}
