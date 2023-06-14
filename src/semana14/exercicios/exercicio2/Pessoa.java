package semana14.exercicios.exercicio2;

public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso){
        setAltura(altura);
        setPeso(peso);
    }

    public double getImc(){
        return peso/(altura*altura);
    } 

    private double imc = getImc();

    public String getFaixa(){
        if (imc < 18.5){
            return "Peso Baixo";
            
        } else if (imc >= 18.5 && imc<24.9){
            return "Peso normal";

        } else if (imc>= 25.0 && imc<29.9){
            return "Sobrepeso";
    
        } else if (imc >= 30.0 && imc<34.9){
            return "Obesidade de Classe 1";
    
        } else if (imc>= 35.0 && imc<39.9){
            return "Obesidade de Classe 2";

        } else {
            return "Obesidade de Classe 3";
        } 
    }

    public void getSituacao(){
        if (imc > 24.9){
                double pesoIdeal = 24 * (altura * altura);
                double mudarPeso = pesoIdeal - peso;
                System.out.println("É ideal mudar " + mudarPeso + "kg para um peso saudável");
            }
            else if (imc < 18.5) {
                double pesoIdeal = 19 * (altura * altura);
                double mudarPeso = pesoIdeal - peso;
                System.out.println("É ideal mudar " + mudarPeso + "kg para um peso saudável");
            }
    }

    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        if (altura <= 0.0 && altura >= 3.5){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }
    public void setPeso(double peso){
        if (peso <= 1.0){
            throw new RuntimeException("Peso inválido");
        }
        this.peso = peso;
    }
}