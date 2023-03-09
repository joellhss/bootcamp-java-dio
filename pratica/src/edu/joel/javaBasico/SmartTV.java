package edu.joel.javaBasico;

public class SmartTV {
    private boolean ligada = false;
    private int canal = 0;
    private int volume = 0;

    public String ligarDesligar() {
        this.ligada = !this.ligada;
        return this.ligada ? "A TV está ligada" : "A TV está desligada";
    };

    public void modificarVolume(String valor) {
        switch (valor) {
            case "aumentar":
            case "+":
                this.volume++;
                break;
            case "diminuir":
            case "-":
                this.volume--;
                break;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void modificarCanal(String valor) {
        switch (valor) {
            case "aumentar":
            case "+":
                this.canal++;
                break;
            case "diminuir":
            case "-":
                this.canal--;
                break;
        }
        System.out.println("Canal: " + this.canal);
    }

    public void modificarCanal(int valor) {
        this.canal = valor;
        System.out.println("Canal: " + this.canal);
    }

}
