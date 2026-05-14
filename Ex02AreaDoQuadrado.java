import java.util.Scanner;

public class Ex02AreaDoQuadrado {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        scanner.nextDouble();

        // pede o usuario o tamanho do lado
        System.out.print("tamanho do lado do quadrado");
        //receba o tamanho do lado
        double lado = scanner.nextDouble();

        // calcule a area (lado * lado)
        double area = lado * lado;

        // exibe o resultado

        System.out.print("a area do quadrado e:" + area );








        }

    }
