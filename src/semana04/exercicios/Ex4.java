package semana04.exercicios;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        System.out.println("Programa identifica se código é válido ");
        System.out.println("Formato válido: BR0000X ");
        System.out.println("--------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Insira seu código identificador: ");
        String identificador = input.nextLine();
        input.close();

        if ((identificador.startsWith("BR")) && (identificador.endsWith("X")) && (identificador.length() == 7)){
            System.out.println("\nO Código identificador válido O");
        }
        else {
            System.out.println("\nX Código identificador inválido X");
        }

        System.out.println("--------------------------------------------");

    }

    
}
