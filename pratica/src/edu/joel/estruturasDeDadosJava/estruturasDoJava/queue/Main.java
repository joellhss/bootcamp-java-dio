package edu.joel.estruturasDeDadosJava.estruturasDoJava.queue;

import edu.joel.estruturasDeDadosJava.estruturasDoJava.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Pegeout"));


        System.out.println(queueCarros);
        queueCarros.offer(new Carro("Renaut"));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
    }
}
