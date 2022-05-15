
package model;


public class InstructorModel {
    private int id;
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
    
    
}
