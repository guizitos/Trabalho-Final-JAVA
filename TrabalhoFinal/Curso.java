import java.util.Date;
import java.util.List;

public class Curso implements Registravel {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public void registrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
}