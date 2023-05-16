package semana12;

public class Quadrado {
    public double lado;

    public Quadrado(double l) {
        lado = l;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return lado + lado + lado + lado;
    }
}