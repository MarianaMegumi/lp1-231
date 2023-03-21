package semana04.exercicios;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

            System.out.println("-------------------------------");
            System.out.println("Programa mostra número antecessor e sucessor");
            System.out.println("-------------------------------");

            Scanner input = new Scanner(System.in);
            System.out.print("Insira um número inteiro: ");
            int numero = input.nextInt();
            input.close();

            System.out.println("\nNúmero antecessor: " + (numero - 1));
            System.out.println("Número inserido: " + (numero));
            System.out.println("Número sucessor: " + (numero + 1));
            System.out.println("-------------------------------");
    }
}