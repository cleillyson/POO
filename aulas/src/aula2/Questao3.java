package aula2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner num_float = new Scanner(System.in);
        System.out.print("Qual o seu peso: ");
        double peso = num_float.nextDouble();
        System.out.print("Qual a sua altura: ");
        double altura = num_float.nextDouble();
        double imc = peso * Math.pow(altura, 2);
        System.out.printf("Seu imc é %.0f.", imc);

    }
}
