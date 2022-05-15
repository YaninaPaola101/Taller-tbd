
package model;


public class DisciplinaModel {
    
    private int id;
    private String disciplina;

    public DisciplinaModel() {
    }

    public DisciplinaModel(String disciplina, int id) {
        this.disciplina = disciplina;
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
