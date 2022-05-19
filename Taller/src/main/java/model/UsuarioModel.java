
package model;



public class UsuarioModel {

    private int id;
    private String nombre;
    private String contrasenia;
    private int edad; 
    private boolean activo;
    private String rol;

    public UsuarioModel() {
    }

    public UsuarioModel(int id, String nombre, String contrasenia, int edad, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.edad = edad;
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
    
    
}
