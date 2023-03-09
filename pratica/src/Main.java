import edu.joel.javaBasico.SmartTV;

public class Main {
    public static void main(String[] args) {
        SmartTV novaTV = new SmartTV();
        System.out.println(novaTV.ligarDesligar());
        novaTV.modificarVolume("+");
        novaTV.modificarCanal(56);
    }
}