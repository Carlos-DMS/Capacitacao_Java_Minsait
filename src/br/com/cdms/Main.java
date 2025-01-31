package br.com.cdms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("---------------");
        System.out.println(":: OPERADORES LOGICOS ::");

        //validacao por operador logico

        boolean condicao = false;
        if (condicao == true) {
            System.out.println("Condição verdadeira");
        }
        else {
            System.out.println("Condição falsa");
        }

        if (!condicao) {
            System.out.println("Ainda falsa");
        }

        System.out.println();

        int idade = 9;

        if (idade <18)
            System.out.println("Menor de idade");
        else
            System.out.println("Maior de idade");

        switch (idade) {
            case 5:
                System.out.println("Criança");
                break;
            case 15:
                System.out.println("Adolescente");
                break;
            case 18, 19, 20:
                System.out.println("Adulto");
                break;
            default:
                if (idade >= 0)
                    System.out.println("Idade não listadas");
                else
                    System.out.println("Idade inválida");
                break;
        }


    }
}
