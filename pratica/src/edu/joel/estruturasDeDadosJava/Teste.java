package edu.joel.estruturasDeDadosJava;

public class Teste {
    public static void main(String[] args) {
        No<String> no1 = new No<String>("Teste1");
        No<String> no2 = new No<String>("Teste2");
        No<String> no3 = new No<String>("Teste3");
        No<String> no4 = new No<String>("Teste4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);



        System.out.println(no1.getProximoNo().getProximoNo());
    }
}
