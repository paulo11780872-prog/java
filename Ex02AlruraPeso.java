import java.util.Scanner;
import java.util.Locale;

public class Ex02AlturaPeso {
}
    public static void main(String[] args) {
        // Define o locale para aceitar ponto(.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("--- calculadora de IMC ---");
        // Entrada de dados
        System.out.print("digite o seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();
        System.out.print("digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();
        // Cálculo do IMC: Peso / (Altura * Altura)
        double imc = peso / (altura * altura);
        // Exibição do resultado formatado
        System.out.printf("%nSeu IMC é: %.2f%n", imc);
        // Mensagem de acordo com o resultado
        System.out.print("classificação: ");
        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("peso saudável");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("sobrepeso");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("obesidade grau I");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("" +"obesidade Grau II (severa)");
        } else {
            System.out.println("obesidade Grau III (mórbida)");
        }

        scanner.close();
    }

