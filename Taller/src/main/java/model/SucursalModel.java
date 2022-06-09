
package model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "sucursal")
public class SucursalModel {
    @Id
    @Column(name = "id_sucursal")
    private int id;
    @Column(name = "direccion")
    private String direccion;

    public SucursalModel() {
    }

    public SucursalModel(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
