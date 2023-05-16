package semana12.exercicios.exercicio1;

public class Programa {
    public static void main(String[] args) {
        Aquario aquario = new Aquario(15, 10, 20);
        Aquario aquarioCubico = new Aquario(15);

        System.out.println("Volume:" + aquario.calcularVolume());
        System.out.println("Volume:" + aquarioCubico.calcularVolume());
    }
}
