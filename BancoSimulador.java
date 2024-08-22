import java.util.Scanner;

public class BancoSimulador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Saldo inicial do usuário
        double saldo = 1000.0;

        // Armazenando informações do usuário
        Usuario usuario = new Usuario();

        do {
            System.out.println("=== Simulador de Banco ===");
            System.out.println("1. Cadastro");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Pagar Conta");
            System.out.println("5. Verificar Saldo");
            System.out.println("6. Alterar Informacoes");
            System.out.println("7. Emitir Fatura");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new Cadastro().executar(usuario);
                    break;
                case 2:
                    saldo = new Saque().executar(saldo);
                    break;
                case 3:
                    saldo = new Deposito().executar(saldo);
                    break;
                case 4:
                    saldo = new PagarConta().executar(saldo);
                    break;
                case 5:
                    new VerificarSaldo().executar(saldo);
                    break;
                case 6:
                    new AlterarInformacoes().executar(usuario);
                    break;
                case 7:
                    new EmitirFatura().executar();
                    break;
                case 0:
                    System.out.println("Saindo do simulador...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }
}
