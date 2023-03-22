package semana05.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insira sua altura em metros: ");
        float altura = sc1.nextFloat();

        System.out.println("Insira seu peso em kilogramas: ");
        float peso = sc1.nextFloat();
        sc1.close();
        
        var imc = peso / (altura * altura);

        System.out.println("Seu imc é de: " + imc);

        if(imc >= 40){
            System.out.println("Obesidade de classe 3");
        }
        else if(imc >= 35){
            System.out.println("Obesidade de classe 2");
            }
        else if(imc >= 30){
            System.out.println("Obesidade de classe 1");
            }
            else if(imc >= 25){
                System.out.println("Excesso de peso");
                }
                else if(imc >= 18.5){
                    System.out.println("Peso normal");
                    }
                    else 
                        System.out.println("Baixo peso");                        


        if (imc > 24.9){
            float pesoideal = 24 * (altura * altura);
            float mudarPeso = pesoideal - peso;
            System.out.println("É ideal mudar " + mudarPeso + "kg para um peso saudável");
        }
        else if (imc < 18.5) {
            float pesoideal = 19 * (altura * altura);
            float mudarPeso = pesoideal - peso;
            System.out.println("É ideal mudar " + mudarPeso + "kg para um peso saudável");

        }
    }
}
