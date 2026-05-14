import java.util.Random;
import java.util.Scanner;

public class Ex03ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String escolhaUsuario = "";
        String escolhaIA = "";
        int numUsuario, numIA, soma;
        System.out.println("--+- JOGO  de par ou impar --*-");
        // Usuário escolhe par ou ímpar
        while (true) {
            System.out.print("escolha [P]ar ou [I]mpar: ");
            escolhaUsuario = scanner.next().toUpperCase();
            if (escolhaUsuario.equals("P") || escolhaUsuario.equals("I")) {
                break;
            }
            System.out.println("opção inválida! Tente novamente.");
        }
        // IA escolhe o oposto
        if (escolhaUsuario.equals("P")) {
            escolhaIA = "I";
            System.out.println("IA escolheu: Ímpar");
        } else {
            escolhaIA = "P";
            System.out.println("IA escolheu: Par");
        }
        //Usuário escolhe número (1 a 10)
        System.out.print("digite um número de 1 a 10: ");
        numUsuario = scanner.nextInt();
        // IA escolhe número (1 a 10)
        numIA = random.nextInt(10) + 1;
        System.out.println("IA escolheu o número: " + numIA);
        //Resultado
        soma = numUsuario + numIA;
        System.out.println("soma: " + numUsuario + " + " + numIA + " = " + soma);
        String resultadoFinal = (soma % 2 == 0) ? "P" : "I";
        System.out.println("o resultado é: " + (resultadoFinal.equals("P") ? "PAR" : "ÍMPAR"));
        if (resultadoFinal.equals(escolhaUsuario)) {
            System.out.println("parabéns! Você GANHOUUUUU! sou muito bom");
        } else {
            System.out.println("A IA robo de bst GANHOUUU!");
        }
        scanner.close();
    }
}