package br.com.cdms;

public class Main {
    public static void main(String[] args) {
       //Orientação a objetos

        Pessoa pessoa = new Pessoa("Carlos", "rua X, número 123", "carlos@gmail.com");

        pessoa.estudar();
        pessoa.lazer(2);

        Pessoa pessoa2 = new Pessoa("João", "joao@gmail.com");

        pessoa2.trabalhar();
        pessoa2.lazer(3);

        System.out.println();

        pessoa2.setNome("João Silva");
        System.out.println("Pessoa 2:");
        System.out.println("nome: " + pessoa2.getNome());
        System.out.println("endereço: " + pessoa2.getEndereco());
        System.out.println("email: " + pessoa2.getEmail());
    }
}
