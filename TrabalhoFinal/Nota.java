

import java.util.Date;
import java.util.List;

public class Nota {
    private Aluno aluno;
    private double valor;

    public Nota(Aluno aluno, double valor) {
        this.aluno = aluno;
        this.valor = valor;
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
