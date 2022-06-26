
package model;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRolModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    
    @Column(name = "")
    public String nombreRol;
    @Column(name = "")
    public String nombreUsuario;
    @Column(name = "activo")
    public boolean activo;
    @Column(name = "fecha_desde")
    public Date fechaIni;
    @Column(name = "fecha_hasta")
    public Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="id_rol")
    public RolModel rolModel;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    public UsuarioModel usuarioModel;
    
    public UsuarioRolModel(){
        
    }
    
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
