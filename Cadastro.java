import java.util.Scanner;

public class Cadastro {

    public void executar(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Usuário ===");
        System.out.print("Digite seu nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.print("Digite seu e-mail: ");
        usuario.setEmail(scanner.nextLine());

        System.out.print("Digite seu telefone: ");
        usuario.setTelefone(scanner.nextLine());

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
    }
}
