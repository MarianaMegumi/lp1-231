package semana12.exercicios.exercicio3;
import java.util.Scanner;

public class Banco{
    public static void main(String[] args) {
        Conta conta = new Conta(01, "Taylos Switch");

        System.out.println("Selecione a operação que deseja fazer:");
        System.out.println("[1] Sacar");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferir dinheiro para outra conta");

        Scanner scanner = new Scanner (system.in);
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                if (Conta.sacar(valor) <= 0.0)
                    System.out.println("Não há valor a ser sacado.");
                else {
                    System.out.println("Insira o valor a ser sacado: ");
                    double valor = scanner.nextDouble();
                    double saldoAtual = Conta.sacar(valor);
                    System.out.println("Saldo atual: " + saldoAtual);
                }
                break;  
            case 2:
                System.out.println("Insira o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                double saldoAtual = Conta.depositar(valor);
                System.out.println("Saldo atual: " + saldoAtual);
                break;
            case 3:
                if (Conta.transferir(valor) <= 0.0)
                    System.out.println("Não há valor a ser transferido");
                else {
                    System.out.println("Insira a conta a ser transferida o valor: ");
                    String usuarioTranferido = scanner.nextLine();
                    System.out.println("Insira o valor a ser tranferido: ");
                    double valor = scanner.nextDouble();
                    double saldoAtual = Conta.sacar(valor);
                    System.out.println("Valor " + valor + " transferido para " + usuarioTranferido + "\nSaldo atual: " + saldoAtual);
        }
        break;
                
        }
    }
}
