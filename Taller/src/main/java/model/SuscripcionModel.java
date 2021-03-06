
package model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "suscripcion")
public class SuscripcionModel {
    @Id
    @Column(name = "id_inscripcion")
    private int id;
    @Column(name = "")
    private String plan;

    public SuscripcionModel(int id, String plan) {
        this.id = id;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
    
}
