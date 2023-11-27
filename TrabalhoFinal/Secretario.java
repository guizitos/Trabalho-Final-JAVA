

import java.util.Date;
import java.util.List;

public class Secretario extends Pessoa implements Autenticavel{
    public Secretario(String nome, String cpf, Date dataNascimento, Date dataEntrada, String senha) {
        super(nome, cpf, dataNascimento, dataEntrada, senha);
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
