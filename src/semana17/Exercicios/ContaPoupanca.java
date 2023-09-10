package semana17.Exercicios;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    private LocalDate aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, LocalDate aniversario) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }

    @Override
    public double calcularTarifa() {
        return getTarifa(); 
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
}