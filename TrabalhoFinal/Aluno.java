import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa implements Autenticavel{
    private String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, Date dataEntrada, String senha, String matricula) {
        super(nome, cpf, dataNascimento, dataEntrada, senha);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}