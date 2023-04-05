package semana06.exercicios.ex01;
import java.util.Scanner;

public class Aquario {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Construa seu aquário ideal :)");
        System.out.println("-------------------------------------------------------\n");

        System.out.println("Insira o comprimento, a altura e a largura do aquário em cm: ");
        double comprimento = sc1.nextDouble();
        double altura = sc1.nextDouble();
        double largura = sc1.nextDouble();

        System.out.println("\nInsira a temperatura ambiente: ");
        double temperaturaAmbiente = sc1.nextDouble();
        System.out.println("Insira a temperatura desejada: ");
        double temperaturaDesejada = sc1.nextDouble();
        sc1.close();

        double volume = calcularVolume(comprimento, altura, largura);
        double potenciaTermostato = calcularTermostrato (volume, temperaturaDesejada, temperaturaAmbiente);
        double filtragem = calcularfiltragem(volume);

        System.out.println("\n-------------------------------------------------------");
        System.out.println("Volume em litros: " + volume);
        System.out.println("Potência do termostato necessária: " + potenciaTermostato);
        System.out.println("Quantidade em litros de filtragem por hora: " + filtragem);
        System.out.println("-------------------------------------------------------");

    }

    public static double calcularVolume (double comprimento, double altura, double largura) {
        return (comprimento * altura * largura) / 1000;
    }
    public static double calcularTermostrato (double volume, double temperaturaDesejada, double temperaturaAmbiente) {
        return volume * 0.5 * (temperaturaDesejada - temperaturaAmbiente);
    }
    public static double calcularfiltragem(double volume) {
        return volume * 2.5;
    }
}