package edu.joel.collectionsJava.lists.exercicio01;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("##.0");


        List<Temperatura> temperaturas = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Double valor = scan.nextDouble();
            temperaturas.add(new Temperatura(valor));
        }

        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(temperatura -> System.out.print(temperatura.getTemperatura() + " "));
        System.out.println();

        double media = temperaturas.stream()
                .mapToDouble(Temperatura::getTemperatura)
                .average()
                .orElse(0d);
        System.out.println("Média das temperaturas: " + formatador.format(media));

        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .mapToDouble(Temperatura::getTemperatura)
                .filter(t -> t > media)
                .forEach(t -> System.out.print(t + " "));
        System.out.println();

        temperaturas.forEach(t -> {
            if (t.getTemperatura() > media) {
                System.out.printf("Em %s a temperatura estava acima da média. Temperatura: %.1f", t.getNomeDoMes(), t.getTemperatura());
            }
            System.out.println();
        });


    }
}



