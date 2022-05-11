
package Funcionalidades;


public class UsuarioFun {

    private String nombreUsuario;
    private int edad; 
    private int telefono;
    private boolean activo;

    public UsuarioFun() {
    }

    public UsuarioFun(String nombreUsuario, int edad, int telefono, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.telefono = telefono;
        this.activo = activo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
