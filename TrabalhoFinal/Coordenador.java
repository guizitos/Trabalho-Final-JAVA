import java.util.Date;
import java.util.List;

public class Coordenador extends Professor implements Autenticavel{
    public Coordenador(String nome, String cpf, Date dataNascimento, Date dataEntrada, String senha, String titulacao, String areaAtuacao) {
        super(nome, cpf, dataNascimento, dataEntrada, senha, titulacao, areaAtuacao);
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}