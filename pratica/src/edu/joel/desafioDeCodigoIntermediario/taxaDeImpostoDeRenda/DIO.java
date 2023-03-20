package edu.joel.desafioDeCodigoIntermediario.taxaDeImpostoDeRenda;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = Double.parseDouble(leitor.next());

        DecimalFormat formatador = new DecimalFormat("00.00");
        double imposto = 0;

        if (renda > 2000.00) {
            renda -= 2000;
            if(renda > 1000) {
                imposto += 1000 * 0.08;
                renda -= 1000;
                if (renda > 1500) {
                    imposto += 1500 * 0.18;
                    renda -= 1500;
                    imposto += renda * 0.28;
                } else {
                    imposto += renda * 0.18;
                }
            } else {
                imposto = renda * 0.08;
            }

            System.out.println("R$ " + formatador.format(imposto));

        } else {
            System.out.println("Isento");
        }



    }

}