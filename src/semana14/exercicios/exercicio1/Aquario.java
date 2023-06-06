package semana14.exercicios.exercicio1;

public class Aquario {
    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura){
        setComprimento(comprimento);
        setAltura(altura);
        setLargura(largura);
    }

    public double calcularVolume(){
        return (comprimento * altura * largura) / 1000;
    } 

    public double calcularPotenciaTermostato(double volume, double temperaturaDesejada,double temperaturaAmbiente){
        double potencia = volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente );
        return potencia;
    }

    public double calcularQuantidadeLitros (double volume){
        return volume * 3;
    }

    public double getComprimento(){
        return comprimento;
    }
    public double getAltura(){
        return altura;
    }
    public double getLargura(){
        return largura;
    }

    public void setComprimento(double comprimento){
        if (comprimento <= 0){
            throw new RuntimeException("Comprimento inválido");
        }
        this.comprimento = comprimento;
    }
    public void setAltura(double altura){
        if (altura <= 0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }
    public void setLargura(double largura){
        if (largura <= 0){
            throw new RuntimeException("Largura inválida");
        }
        this.largura = largura;
    }
}
