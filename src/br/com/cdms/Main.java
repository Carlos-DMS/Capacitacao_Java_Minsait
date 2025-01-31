package br.com.cdms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("---------------");
        System.out.println(":: OPERADORES LOGICOS ::");

        //estruturas de repetição

        int max = 21;
        for (int num = 0; num <= max; num++) {
            //System.out.println("> " + num);
            if (num % 2 == 0) {
                System.out.println("> " + num + " *");
            }
            else {
                System.out.println("> " + num);
            }
        }

        int indice = 0;

        while (indice <= 100) {
            System.out.print("indice: " + indice);

            switch (indice) {
                case 45:
                    System.out.println(" - Número sorteado! :)");
                    break;
                default:
                    System.out.println(" - Esse número não foi sorteado :(");
                    break;
            }
            indice++;
        }

    }
}
