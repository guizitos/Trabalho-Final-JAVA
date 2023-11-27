

import java.util.Date;
import java.util.List;

public class Frequencia {
    private Aluno aluno;
    private Date data;
    private boolean presente;

    public Frequencia(Aluno aluno, Date data, boolean presente) {
        this.aluno = aluno;
        this.data = data;
        this.presente = presente;
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public Date getData() {
        return data;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}