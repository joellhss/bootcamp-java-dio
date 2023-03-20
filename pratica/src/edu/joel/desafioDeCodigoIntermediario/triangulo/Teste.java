package edu.joel.desafioDeCodigoIntermediario.triangulo;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("##.0");

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo = false;

        //TODO: Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.

        if((A + B) > C && (B + C) > A && (A + C) > B) {
            triangulo = true;
        }

        if (triangulo) {
            soma = A + B + C;
            System.out.println("Perimetro = " + formatador.format(soma));
        } else {
            soma = ((A + B) * C) / 2;
            System.out.println("Area = " + formatador.format(soma));
        }

    }

}