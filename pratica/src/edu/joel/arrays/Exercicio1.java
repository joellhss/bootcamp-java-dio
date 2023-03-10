package edu.joel.arrays;

/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/
public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 10, -5, 20, 50, 8};

        System.out.println("Vetor inverso:");
        for(int i = (numeros.length-1); i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
