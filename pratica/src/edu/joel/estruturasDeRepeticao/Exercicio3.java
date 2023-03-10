package edu.joel.estruturasDeRepeticao;

/*
* Maior e Média: Faça um programa que leia 5 números e informe
* o maior número e a média desses números.
*/

public class Exercicio3 {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.5, 9.0, 10.0, 6.5};
        int contador = 0;
        double maior = notas[0];
        double media = 0;

        do {
            if(notas[contador] > maior) {
                maior = notas[contador];
            }
            media += notas[contador];
            contador++;
        } while(contador < notas.length);

        System.out.println("O maior número é: " + maior);
        System.out.println("A media dos valores é: " + media/contador);
    }
}
