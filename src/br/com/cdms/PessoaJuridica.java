package br.com.cdms;

public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String nomeFantasia, String cnpj) {
        super(nome, endereco, email);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
