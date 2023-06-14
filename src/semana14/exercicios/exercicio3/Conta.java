package semana14.exercicios.exercicio3;

public class Conta {
    private int codigo;
    private double saldo = 0.0;
    private String correntista;

    public Conta(int codigo, String correntista){
        setCodigo(codigo);
        setCorrentista(correntista);
    }

    public boolean sacar (double valor){
        setSaldo (saldo - valor);
        return true;
    }

    public boolean depositar (double valor){
        setSaldo(saldo + valor);
        return true;
    }

    public boolean transferir (Conta contaDestino, double valor){
        sacar(valor);
        contaDestino.depositar(valor);
        return true;
    }

    // get
    public int getCodigo () {
        return codigo;
    }
    public double getSaldo () {
        return saldo;
    }
    public String getCorrentista () {
        return correntista;
    }

    // set
    private void setCodigo (int codigo) {
        if (codigo < 0)
            throw new RuntimeException("Insira um código maior que 0");
        this.codigo = codigo;
    }
    private void setCorrentista (String correntista){
        if (correntista.length() < 5 || correntista.length() > 100)
            throw new RuntimeException("Insira um nome válido (min 5, max 100 caracteres)");
        this.correntista = correntista;
    }
    private void setSaldo(double saldo) {
        if(saldo < 0.0) 
            throw new RuntimeException("Você não pode manipular um valor maior que o seu saldo");
        this.saldo = saldo;
    }
}
