package semana12;

public class Retangulo {
    //Atributos da classe
    public double base;
    public double altura;

    //Construtor - atribui valores de fora (Programa) aos atributos da classe
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        //this.base - atributo da classe 
    }

    //Métodos
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return base + base + altura + altura;
    }
}
    

