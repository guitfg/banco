import java.util.Scanner;

public class AlterarInformacoes {

    public void executar(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Alterar Informações do Usuário ===");

        System.out.print("Digite seu novo nome (atual: " + usuario.getNome() + "): ");
        String novoNome = scanner.nextLine();
        if (!novoNome.isEmpty()) {
            usuario.setNome(novoNome);
        }

        System.out.print("Digite seu novo e-mail (atual: " + usuario.getEmail() + "): ");
        String novoEmail = scanner.nextLine();
        if (!novoEmail.isEmpty()) {
            usuario.setEmail(novoEmail);
        }

        System.out.print("Digite seu novo telefone (atual: " + usuario.getTelefone() + "): ");
        String novoTelefone = scanner.nextLine();
        if (!novoTelefone.isEmpty()) {
            usuario.setTelefone(novoTelefone);
        }

        System.out.println("Informações alteradas com sucesso!");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
    }
}
