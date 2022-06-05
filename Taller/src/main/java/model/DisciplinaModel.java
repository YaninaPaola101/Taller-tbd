
package model;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class DisciplinaModel {
    @Id
    @Column(name = "id_disciplina")
    private int id;
    @Column(name = "nombre")
    private String disciplina;

    public DisciplinaModel() {
    }

    public DisciplinaModel(String disciplina) {
        this.disciplina = disciplina;
        
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
    
    @Override
    public String toString() {
        return disciplina;
    }
    
}
