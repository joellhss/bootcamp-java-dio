package edu.joel.arrays;

/*
* Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga
* quantas consoantes foram lidas. Imprima as consoantes.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"};
        int consoantes = 0;
        int vogais = 0;

        for(int i = 0; i < abc.length; i++) {
            if(abc[i] == "a" || abc[i] == "e" || abc[i] == "i" || abc[i] == "o" || abc[i] == "u") {
                vogais++;
            } else {
                consoantes++;
            }
        }

        System.out.println("vogais: " + vogais);
        System.out.println("consoantes: " + consoantes);
    }
}
