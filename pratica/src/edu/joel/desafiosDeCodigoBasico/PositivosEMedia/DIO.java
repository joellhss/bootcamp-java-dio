package edu.joel.desafiosDeCodigoBasico.PositivosEMedia;
import java.io.IOException;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;
        String aux;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            System.out.println("Escreva o valor " + (i + 1) + ": ");
            aux = leitor.next();
            x = Double.parseDouble(aux);
            if(x > 0) {
                cont++;
                media += x;
            }
    }

    media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
}

}