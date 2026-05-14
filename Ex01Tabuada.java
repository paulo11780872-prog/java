import java.util.Scanner;

public class Ex01tabuada {
}

public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    System.out.print("digite o numero para ver a tabuada:");
    // Lê o número inteiro fornecio pelo usuario
    int numero = scanner.nextInt();
    System.out.println("tabuada do " + numero + ":");
    System.out.println("--------------------");
    // Loop for para gerar a tabuada pelo 1 a 10
    int i;
    for (i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
    // fecha o scanner para evitar vazamento de memoria
    scanner.close();
}
