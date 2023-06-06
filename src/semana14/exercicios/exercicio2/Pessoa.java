package semana14.exercicios.exercicio2;

public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso){
        setAltura(altura);
        setPeso(peso);
    }

    public double calcularImc(){
        return peso/(altura*altura);
    } 

    public String getFaixa(double imc){
        if (imc<18.5){
            return "Peso Baixo";
            
        } else if (imc >= 18.5 && imc<24.9){
            return "Peso normal";

        } else if (imc>= 25.0 && imc<29.9){
            return "Sobrepeso";       if (altura <= 0){
                throw new RuntimeException("Altura inválida");
            }
            this.altura = altura;<34.9){
            return "Obesidade de Classe 1";
    
        } else if (imc>= 35.0 && imc<39.9){
            return "Obesidade de Classe 2";

        } else {
            return "Obesidade de Classe 3";
        } 
    }

    public String getSituacao (double imc){
        if (imc<18.5){
          return "GANHAR";
        } else if (imc>=18.5&&imc<24.9){
            return "NORMAL";
        } else{
            return "PERDER";
        }
    }

    public String getAltura(){
        return altura;
    }
    public String getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        if (altura <= 1.0 && altura >= 3.0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }
    public void setPeso(double peso){
        if (peso <= 1.0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }
}
