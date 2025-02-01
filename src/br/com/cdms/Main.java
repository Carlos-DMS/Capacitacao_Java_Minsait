package br.com.cdms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //COLEÇÕES

        //ArrayList

        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("José");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println("Nome" + nome);
        }

        //HashSet

        Set<String> cores = new HashSet<>();

        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Roxo");

        System.out.println("--------------");

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        //HashMap

        Map<String, String> paises = new HashMap<>();

        paises.put("Brasil", "Brasilia");
        paises.put("Franca", "Paris");
        paises.put("Portugal", "Lisboa");

        for (Map.Entry<String, String> capital : paises.entrySet()) {
            System.out.println(" - " + capital.getValue());
        }

        Map<Integer, Pessoa> mapPessoas = new HashMap<>();

        mapPessoas.put(1, new Pessoa("carlos@gmail.com", "Carlos"));
        mapPessoas.put(2, new Pessoa("maria@gmail.com", "Maria"));
        mapPessoas.put(3, new Pessoa("joão@gmail.com", "João"));

        System.out.println("Pessoa João no map: " + mapPessoas.get(3).getNome());

    }
}
