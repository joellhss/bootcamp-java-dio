package edu.joel.desafioDeCodigoIntermediario.contaEspacosEVogais;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] strSplit = str.split(" ");
        String novaString = "";


        int espacosEmBranco = strSplit.length - 1;
        int quantVogais = 0;

        for (String item : strSplit) {
            novaString += item;
        }

        for(int i = 0; i < novaString.length(); i++) {
            char caractere = novaString.charAt(i);

            boolean validador = caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u';

            if ( validador) {
                quantVogais++;
            }
        }


        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}