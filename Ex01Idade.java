import java.util.Scanner;


public class Ex01Idade {
    static void main() {
        // Criar um scanner para ler entrada do console
        Scanner scanner = new Scanner(System.in);
        // Solicita e le o nome
        String nome = new String("paulo");
        String idade = new String("15 anos");
        System.out.print("ola, sou o" + nome + " voce tem " + idade);
        nome = scanner.nextLine();

    }

}


