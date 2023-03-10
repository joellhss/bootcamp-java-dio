package edu.joel.estruturasDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
*  Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
* qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
* numero ele deseja ver a tabuada.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        int multiplicando = new Scanner(System.in).useLocale(Locale.US).nextInt();

        for(int i=0; i<=10; i++) {
            System.out.println(multiplicando + "x" + i + "=" + i*multiplicando);
        }
    }
}