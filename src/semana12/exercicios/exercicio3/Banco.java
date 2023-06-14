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
                if (Conta.sacar(0.0) <= 0.0)
                    System.out.println("Não há valor a ser sacado.");
                else {
                    System.out.println("Insira o valor a ser sacado: ");
                    double valorSacar = scanner.nextDouble();
                    double saldoAtualS = Conta.sacar(valorSacar);
                    System.out.println("Saldo atual: " + saldoAtualS);
                }
                break;  
            case 2:
                System.out.println("Insira o valor a ser depositado: ");
                double valorDepositar = scanner.nextDouble();
                double saldoAtualD = Conta.depositar(valorDepositar);
                System.out.println("Saldo atual: " + saldoAtualD);
                break;
            case 3:
                if (Conta.transferir(0.0) <= 0.0)
                    System.out.println("Não há valor a ser transferido");
                else {
                    System.out.println("Insira a conta a ser transferida o valor: ");
                    String usuarioTranferido = scanner.nextLine();
                    System.out.println("Insira o valor a ser tranferido: ");
                    double valorTransferir = scanner.nextDouble();
                    double saldoAtualT = Conta.sacar(valorTransferir);
                    System.out.println("Valor " + valor + " transferido para " + usuarioTranferido + "\nSaldo atual: " + saldoAtualT);
                }
                break;
            default:
                System.out.println("Insira uma operação válida.");
                break;        
        }
    }
}
