package semana12;

public class Programa {
    public static void main(String[] args) {
    Quadrado quadrado = new Quadrado(10.0);

    System.out.println(quadrado.calcularArea());
    System.out.println(quadrado.calcularPerimetro());
///////////////////////////////////////////////////////////////////////
    Retangulo r1 = new Retangulo(10.0, 5.0);
    Retangulo r2 = new Retangulo(20.0, 7.0);

    System.out.println(r1.calcularArea());
    System.out.println(r1.calcularPerimetro());
    System.out.println(r2.calcularArea());
    System.out.println(r2.calcularPerimetro());
//////////////////////////////////////////////////////////////////////
    Circulo c1 = new Circulo(10.0);

    System.out.println(c1.calcularArea());
    System.out.println(c1.calcularPerimetro());
    }
}
