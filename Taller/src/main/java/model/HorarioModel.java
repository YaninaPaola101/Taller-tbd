
package model;

import jakarta.persistence.*;

@Entity
@Table(name = "clase")
public class HorarioModel {
    private int id;
    private int inicio;
    private int fin;

    public HorarioModel() {
    }

    public HorarioModel(int inicio, int fin, int id) {
        this.inicio = inicio;
        this.fin = fin;
        this.id = id;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
