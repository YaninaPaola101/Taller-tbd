
package model;

import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "rol")
public class RolModel {
    
    @Id
    @Column(name = "id_rol")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "rolModel")
    Set<UsuarioRolModel> usuarioRolModels;
    
    public RolModel(){
        
    }
    public RolModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
