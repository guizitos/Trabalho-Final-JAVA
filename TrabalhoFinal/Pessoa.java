import java.util.Date;
import java.util.List;

public abstract class Pessoa implements Autenticavel {
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected Date dataEntrada;
    protected String senha;

    public Pessoa(String nome, String cpf, Date dataNascimento, Date dataEntrada, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataEntrada = dataEntrada;
        this.senha = senha;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
