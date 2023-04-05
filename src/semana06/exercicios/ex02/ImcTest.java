package semana06.exercicios.ex02;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class ImcTest {

    @Test
    public class Ex02 {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Insira sua altura em metros: ");
            float altura = sc1.nextFloat();
    
            System.out.println("Insira seu peso em kilogramas: ");
            float peso = sc1.nextFloat();
            sc1.close();
            
            float imc =  CalcularImc(peso, altura);
            String classificacao = ClassificarPeso(imc);

            System.out.println("Seu imc é de: " + imc + "\n" + classificacao);                     
    
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

    @Test
    public static float CalcularImc(float peso, float altura) {
        return peso / (altura * altura);        
    }

    @Test
    public static String ClassificarPeso (float imc) {
        String classificacao;

        if(imc >= 40){
            classificacao = "Obesidade de classe 3";
        }
        else if(imc >= 35){
            classificacao = "Obesidade de classe 2";
            }
        else if(imc >= 30){
            classificacao = "Obesidade de classe 1";
            }
            else if(imc >= 25){
                classificacao = "Excesso de peso";
                }
                else if(imc >= 18.5){
                    classificacao = "Peso normal";
                    }
                    else 
                    classificacao = "Baixo peso";   
    
    return classificacao;
    }
}
