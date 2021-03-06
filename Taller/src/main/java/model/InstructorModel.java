
package model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "instructor")
public class InstructorModel {
    @Id
    @Column(name = "instructor")
    private int id;
    @Column(name = "nombre")
    private String nombreInstructor;

    public InstructorModel() {
    }

    public InstructorModel(int id, String nombreInstructor) {
        this.id = id;
        this.nombreInstructor = nombreInstructor;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return nombreInstructor;
    }
}
