import java.util.Date;
import java.util.List;

public class Disciplina implements Registravel, Avaliavel {
    private Professor professorResponsavel;
    private List<Aluno> alunos;
    private List<Frequencia> frequencias;
    private List<Nota> notas;
    
    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setFrequencias(List<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
    
    @Override
    public void registrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
    
    @Override
    public void adicionarNota(Aluno aluno, Nota nota) {
        this.notas.add(nota);
    }

    @Override
    public Nota recuperarNota(Aluno aluno) {
        for (Nota nota : this.notas) {
            if (nota.getAluno().equals(aluno)) {
                return nota;
            }
        }
        return null;
    }
}
