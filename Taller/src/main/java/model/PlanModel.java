
package model;



public class PlanModel {

    private int id;
    private String nombrePlan;
    private int costo;

    public PlanModel() {
    }

    public PlanModel(int id, String nombrePlan, int costo) {
        this.id = id;
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
    
    
}
