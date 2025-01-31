package br.com.cdms;

public class Main {
    public static void main(String[] args) {
       //Orientação a objetos

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Carlos";
        pessoa.email = "carlos@gmail.com";
        pessoa.endereco = "rua X, número 123";

        pessoa.estudar();
        pessoa.lazer(2);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "João";
        pessoa2.email = "joao@gmail.com";
        pessoa2.endereco = "";

        pessoa2.trabalhar();
    }
}
