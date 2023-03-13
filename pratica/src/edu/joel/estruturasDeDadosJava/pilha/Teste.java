package edu.joel.estruturasDeDadosJava.pilha;

public class Teste {

    public static void main(String[] args) {
        Pilha numeros = new Pilha();
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);
        numeros.push(6);

        System.out.println(numeros);

        numeros.pop();
        System.out.println(numeros);

        numeros.push(561);
        System.out.println(numeros);
    }
}
