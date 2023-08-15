package aula2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = notas.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = notas.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf(String.valueOf(media));

    }
}
