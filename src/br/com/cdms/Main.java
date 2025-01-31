package br.com.cdms;

import br.com.cdms.exception.LimitePixExcedidoException;
import br.com.cdms.utils.ContaBancaria;
import br.com.cdms.utils.Funcoes;

public class Main {
    public static void main(String[] args) {
        //Tratamento de erros

        int valor = 10;
        int divisao = 2;

        System.out.println("Vou fazer a divisão!");

        int resposta = 0;

        try {
            resposta = valor / divisao;
            System.out.println("Resposta = " + resposta);

            int[] correcoes = {1,6,7,10,4};
            for (int i = 0; i < 6; i++) {
                System.out.println("Correções: " + correcoes[i]);
            }
        }
        catch (ArithmeticException e)  {
            System.out.println("ERRO ARITMETICO: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("ERRO ARRAY: " + e.getMessage());
        }
        catch (Exception e)  {
            System.out.println("ERRO GENERICO: " + e.getMessage());
        }

        int correcao = resposta + 2;
        System.out.println("A correção monetaria é de R$" + correcao);

        //throws

        String retornoWeb = "5";
        if (Funcoes.isNumeric(retornoWeb)) {
            System.out.println("A variavel retornoWeb é numerica");
        }
        else {
            System.out.println("A variavel retornoWeb não é numerica");
        }

        //Exceção personalizada

        ContaBancaria conta = new ContaBancaria(1000.00);
        ContaBancaria conta2 = new ContaBancaria();

        try {
            conta.fazerPix(1700.00);
            conta2.fazerPix(1900.00);
        }
        catch (LimitePixExcedidoException e) {
            System.out.println(e.getMessage());
        }
    System.out.println("Transferencia feita!");
    }
}
