package semana12.exercicios.exercicio3;

public class Conta {
    public int codigo;
    public double saldo = 0.0;
    public String correntista;

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar(double valor){
        if (saldo <= 0.0)
            return saldo;
        else
            return this.saldo - valor; 
    }

    public double depositar(double valor){
        return this.saldo + valor;
    }

    public double transferir(double valor){
        if (saldo < 0)
        return (0.0);
        else
        return (this.saldo - valor); 
    }

}
