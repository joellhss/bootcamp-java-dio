package edu.joel.estruturasDeDadosJava.listaEncadeada;

public class Teste {
    public static void main(String[] args) {
        listaEncadeada<String> minhaLista = new listaEncadeada<>();
        minhaLista.add("primeiro");
        minhaLista.add("segundo");
        minhaLista.add("terceiro");
        minhaLista.add("quarto");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(1));
        minhaLista.remove(3);

        System.out.println(minhaLista);
    }
}
