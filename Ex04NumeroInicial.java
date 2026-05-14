import java.util.Scanner;

public class Ex04NumeroInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("--- programa de Entrada de Números ---");
        System.out.print("informe o número inicial: ");

        // Lê o primeiro número
        numero = scanner.nextInt();

        // Loop principal: continua até o usuário digitar 0
        while (numero != 0) {

            // Verifica se o número é ímpar (resto da divisão por 2 é diferente de 0)
            if (numero % 2 != 0) {
                System.out.println("número " + numero + " é ímpar e foi ignorado.");
            } else {
                // Se for par, processa o número
                System.out.println("número processado: " + numero);
            }

            // Pede o próximo número
            System.out.print("informe outro número (ou 0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("programa encerrado.");
        scanner.close();
    }
}