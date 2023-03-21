package semana04.exercicios;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("-------------------------------");
        System.out.println("Programa calcula desconto da compra");
        System.out.println("-------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        float valorCompra = input.nextInt();
        input.close();
        System.out.println("-------------------------------");
        
        byte desconto = 0;

        if (valorCompra >= 500){
            desconto = 15;
        }
        else {
            if (valorCompra >= 100){
                desconto = 10;
            }
            else {
                if (valorCompra >= 10){
                    desconto = 5;
                }
                else {
                    if (valorCompra >= 0.01){
                        desconto = 0;
                    }
                    else {
                        System.out.println("Valor não identificado");
                        System.out.println("Fim do programa");
                        System.out.println("-------------------------------");
                        return;
                    }
                }
            }
        }
        valorCompra -=  valorCompra * (0.01 * desconto);

        System.out.println("O valor final é de: " + valorCompra);
        System.out.println("Desconto de: " + desconto + "%");
        System.out.println("-------------------------------");
    }
}
