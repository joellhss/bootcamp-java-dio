package edu.joel.estruturasDeRepeticao;

/*
* Par e Ímpar: Faça um programa que peça N números inteiros.
* Calcule e mostre a quantidade de números pares
* e a quantidade de números impares.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 5, 7, 12, 7, 8, 9, 16, 2};
        int par = 0;
        int impar = 0;
        int contador = 0;

        do {
            int verificador = numeros[contador] % 2;
            if (verificador == 0) {
                par++;
            } else {
                impar++;
            }
            contador++;
        } while (contador < numeros.length);

        System.out.println("Números verificados: " + numeros.length);
        System.out.println("par: " + par);
        System.out.println("impar: " + impar);
    }
}
