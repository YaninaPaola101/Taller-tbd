
package Funcionalidades;


public class Registro {

    private String nombre;
    private int edad; 
    private boolean activo;

    public Registro() {
    }

    public Registro(String nombreUsuario, int edad, boolean activo) {
        this.nombre = nombreUsuario;
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
    
    
}
