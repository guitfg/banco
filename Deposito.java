import java.util.Scanner;

public class Deposito {

    public double executar(double saldo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor para depositar: ");
        double valorDeposito = scanner.nextDouble();

        saldo += valorDeposito;
        System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
        System.out.println("Saldo atual: R$" + saldo);

        return saldo;
    }
}