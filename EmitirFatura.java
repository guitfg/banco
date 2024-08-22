import java.util.Random;

public class EmitirFatura {

    public void executar() {
        // Exemplo de geração de uma fatura aleatória
        Random random = new Random();
        double valorFatura = 50 + (500 - 50) * random.nextDouble();
        System.out.println("Fatura emitida com valor de R$" + String.format("%.2f", valorFatura));
    }
}
