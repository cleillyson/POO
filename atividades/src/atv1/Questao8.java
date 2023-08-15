package atv1;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner numInt = new Scanner(System.in);
        int numero = numInt.nextInt();
        while (numero != 1){
            if (numero % 2 == 0) {
                numero = numero / 2;
            }
            if (numero == 1){
                System.out.print("1");
                break;
            }
            else if(numero % 2 == 1){
                numero = 3 * numero + 1;
            }
            System.out.printf(numero + "->");
        }
    }
}
