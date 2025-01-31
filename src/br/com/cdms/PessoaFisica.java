package br.com.cdms;

public class PessoaFisica extends Pessoa{

    //atributos
    private String cpf;

    //construtor

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    //GETs e SETs

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
