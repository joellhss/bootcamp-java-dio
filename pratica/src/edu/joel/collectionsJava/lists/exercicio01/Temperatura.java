package edu.joel.collectionsJava.lists.exercicio01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temperatura implements Comparable<Temperatura>{

    private List<String> nomeDosMeses = new ArrayList<>(Arrays.asList(
            "janeiro", "fevereiro", "março", "abril", "maio", "junho","julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
            ));
    private Double temperatura;
    private String nomeDoMes;
    private static int contador = 0;

    public Temperatura(Double temperatura) {
        this.temperatura = temperatura;
        this.nomeDoMes = nomeDosMeses.get(contador);
        contador++;

        if(contador > 12)
            contador = 0;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getNomeDoMes() {
        return nomeDoMes;
    }

    public void setNomeDoMes(String nomeDoMes) {
        this.nomeDoMes = nomeDoMes;
    }

    @Override
    public int compareTo(Temperatura o) {
        return this.temperatura.compareTo(o.temperatura);
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                ", nomeDoMes='" + nomeDoMes + '\'' +
                '}';
    }
}
