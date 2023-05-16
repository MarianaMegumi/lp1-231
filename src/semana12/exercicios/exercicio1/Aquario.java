package semana12.exercicios.exercicio1;

public class Aquario {
   
    public double comprimento;
    public double altura;
    public double largura;

    public Aquario(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double medida){
        this.comprimento = medida;
        this.largura = medida;
        this.altura = medida;
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
}
