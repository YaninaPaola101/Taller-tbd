
package Funcionalidades;


public class PlanFun {

    private String nombrePlan;
    private int costo;

    public PlanFun() {
    }

    public PlanFun(String nombrePlan, int costo) {
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
    
    
}
