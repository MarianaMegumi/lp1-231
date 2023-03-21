package semana04.exercicios;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("-------------------------------");
        System.out.println("Programa média aritmética de três números");
        System.out.println("-------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Insira três números: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();
        input.close();
        System.out.println("-------------------------------");

        System.out.println("Média aritmética: " + (numero1 + numero2 + numero3)/3);
        System.out.println("-------------------------------");

    }
}
