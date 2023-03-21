import java.util.Scanner;

public class Ex01 {
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

        double volumeL = (comprimento * altura * largura)/1000;
        double potenciaTermostato = volumeL * 0.5 * (temperaturaDesejada - temperaturaAmbiente);
        double filtragem = volumeL * 2.5;

        System.out.println("\n-------------------------------------------------------");
        System.out.println("Volume em litros: " + volumeL);
        System.out.println("Potência do termostato necessária: " + potenciaTermostato);
        System.out.println("Quantidade em litros de filtragem por hora: " + filtragem);
        System.out.println("-------------------------------------------------------");


    }
}
