package semana14.Formas;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
       // quadrado.lado = 10.0;

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());
    }
}