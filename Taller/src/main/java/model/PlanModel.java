
package model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "plan")
public class PlanModel {
    @Id
    @Column(name = "id_plan")
    private int id;
    @Column(name = "nombre")
    private String nombrePlan;
    @Column(name = "costo")
    private int costo;
    @Column(name = "meses")
    private int meses;

    public PlanModel() {
    }

    public PlanModel(String nombrePlan, int costo) {
        
        this.nombrePlan = nombrePlan;
        this.costo = costo;
       
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    @Override
    public String toString(){
        return nombrePlan;
    } 
}
