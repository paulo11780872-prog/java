import java.util.Scanner;

public class Ex01IdadeDuasPessoas {}
void main() {
    // Criar um scanner para ler entrada do console
    Scanner scanner = new Scanner(System.in);

    //entrada de dados da primeira pessoa
    System.out.print("doigite o nome da primeira pesso:");
    String nome1 = scanner.nextLine();
    System.out.print("digite a idade de "+ nome1 +" ");
    int idade1 = scanner. nextInt();

    //limpar o buffer do scaner (nessessario apos nextint())
    scanner.nextLine();

    //entrada de dados da segunda pessoa
    System.out.print("doigite o nome da segunda pesso:");
    String nome2 = scanner.nextLine();
    System.out.print("digite a idade de "+ nome2 +" ");
    int idade2 = scanner. nextInt();

    // Cálculo da diferença de idade
    int diferenca = Math.abs(idade1 - idade2);
    // Impressão do resultado
    System.out.println("\n-------- Resuntado ---------");
    System.out.println("\n---------------|___|--------");
    System.out.println("\n------|___|----|---|--------");
    System.out.println("\n------|---|-----------------");
    System.out.println(nome1 + " tem " + idade1 + " anos.");
    System.out.println(nome2 + " tem " + idade2 + " anos.");
    System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferenca + " ano(s).");

    scanner.close();









}