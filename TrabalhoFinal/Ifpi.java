

import java.util.Date;
import java.util.List;

public class Ifpi {
    private List<Pessoa> funcionarios;
    private List<Curso> cursos;
    private List<Aluno> alunos;

    public Ifpi(List<Pessoa> funcionarios, List<Curso> cursos, List<Aluno> alunos) {
        this.funcionarios = funcionarios;
        this.cursos = cursos;
        this.alunos = alunos;
    }
    
    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
