import java.util.Scanner;

public class PagarConta {

    public double executar(double saldo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da conta a ser paga: ");
        double valorConta = scanner.nextDouble();

        if (valorConta > saldo) {
            System.out.println("Saldo insuficiente para pagar a conta.");
        } else {
            saldo -= valorConta;
            System.out.println("Pagamento de conta no valor de R$" + valorConta + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        }

        return saldo;
    }
}
