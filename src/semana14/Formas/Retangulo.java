package semana14.Formas;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo (double base, double altura){
        setBase(base);
        setAltura(altura);
    }
    
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }

    public void setBase(double base){
        if (base <= 0.0){
            throw new RuntimeException("Base inválida");
        }
        this.base = base;
    }

    public void setAltura(double altura){
        if (altura <= 0.0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }    
}

