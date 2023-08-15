package aula2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raioCirculo = area.nextDouble();
        double areaCirculo = 3.14 * Math.pow(raioCirculo, 2);
        System.out.printf("A area do circulo %.2f", areaCirculo);
    }
}
