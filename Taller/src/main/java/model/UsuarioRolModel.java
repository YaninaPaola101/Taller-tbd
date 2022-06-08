
package model;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRolModel {
   
    @Id
    public String nombreRol;
    public String nombreUsuario;
    public boolean activo;
    public Date fechaIni;
    public Date fechaFin;

    public UsuarioRolModel(String nombreRol, String nombreUsuario, boolean activo, Date fechaIni, Date fechaFin) {
        this.nombreRol = nombreRol;
        this.nombreUsuario = nombreUsuario;
        this.activo = activo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    

}
