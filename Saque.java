import java.util.Scanner;

public class Saque {

    public double executar(double saldo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor para sacar: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        }

        return saldo;
    }
}
