

import java.util.Date;
import java.util.List;

public class Professor extends Pessoa implements Autenticavel{
    private String titulacao;
    private String areaAtuacao;

    public Professor(String nome, String cpf, Date dataNascimento, Date dataEntrada, String senha, String titulacao, String areaAtuacao) {
        super(nome, cpf, dataNascimento, dataEntrada, senha);
        this.titulacao = titulacao;
        this.areaAtuacao = areaAtuacao;
    }
    
    public String getTitulacao() {
        return titulacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

