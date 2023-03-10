package edu.joel.estruturasDeRepeticao;


import java.util.Locale;
import java.util.Scanner;

/*
*Nome e Idade: Faça um programa que leia conjuntos de dois valores,
* o primeiro representando o nome do aluno e o segundo representando a sua idade.
* (Pare o programa inserindo o valor 0 no campo nome)
*/
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite seu nome:");
            nome = resposta.next();
            if (nome.equals("0")) break;

            System.out.println("Informe sua idade:");
            idade=resposta.nextInt();
        }

    }
}
