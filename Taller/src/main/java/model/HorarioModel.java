
package model;


public class HorarioModel {
    private int id;
    private int inicio;
    private int fin;
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getInicioClase() {
        return inicioClase;
    }

    public void setInicioClase(String inicioClase) {
        this.inicioClase = inicioClase;
    }

    public String getFinClase() {
        return finClase;
    }

    public void setFinClase(String finClase) {
        this.finClase = finClase;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    private String inicioClase;
    private String finClase;
    private String instructor;
    

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
