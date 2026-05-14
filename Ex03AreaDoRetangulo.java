import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Ex02AreaDoRetangulo{}
     void main() {
         Scanner scanner = new Scanner(System.in);
         //receba a base
         System.out.print("digite o valor da base:");
         double base = scanner .nextDouble();

         //receba a altura
         System.out.print("digite o valor da base:");
         double altura = scanner.nextDouble();
         //cau
         // calcule a area + (base * altura)
         double area = base * altura;

         //exibe o resultado

         System.out.print("a area do retangulo é:" + area );








 }