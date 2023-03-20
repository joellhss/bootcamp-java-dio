package edu.joel.desafioDeCodigoIntermediario.quitandaDoSeuZe;

import java.util.Scanner;

public class DIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double precoTotal = 0;

        if (morangos > 5) {
            precoTotal += morangos * 2.20d;
        } else {
            precoTotal += morangos * 2.50d;
        }

        if (macas > 5) {
            precoTotal += macas * 1.50d;
        } else {
            precoTotal += macas * 1.80d;
        }

        if((macas + morangos) > 8 || precoTotal > 25.00) {
            precoTotal = precoTotal - (precoTotal * 0.1);
        }

        System.out.println(precoTotal);

    }
}
