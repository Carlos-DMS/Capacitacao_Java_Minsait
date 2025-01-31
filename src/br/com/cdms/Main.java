package br.com.cdms;

public class Main {
    public static void main(String[] args) {
        //Orientação a objetos

        PessoaFisica pFisica = new PessoaFisica(
                "nome",
                "endereco",
                "email",
                "cpf"
        );

        System.out.println("nome: " + pFisica.getNome());
        System.out.println("endereço: " + pFisica.getEndereco());
        System.out.println("email: " + pFisica.getEmail());
        System.out.println("cpf: " + pFisica.getCpf());

        Pessoa pessoaNet;

        boolean ehPessoaFisica = false;

        if (ehPessoaFisica) {
            pessoaNet = new PessoaFisica("nome", "endereco", "email", "cpf");
        }
        else {
            pessoaNet = new PessoaJuridica("nome", "endereco", "email", "nomeFantasia", "cnpj");
        }
    }
}
