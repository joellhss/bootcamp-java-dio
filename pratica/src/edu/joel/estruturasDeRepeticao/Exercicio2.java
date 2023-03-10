package edu.joel.estruturasDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
*Nota: Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue pedindo
* até que o usuário informe um valor válido.
*/

public class Exercicio2 {
    public static void main(String[] args) {
        double nota;
        Scanner resposta = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("Insira um valor entre 0 e 10:");
            nota = resposta.nextDouble();
            if (nota >= 0 && nota <= 10) {
                System.out.println("obrigado!");
                break;
            } else {
                System.out.println("Erro: o valor deve ser entre 0 e 10.");
            }
        }
    }
}
