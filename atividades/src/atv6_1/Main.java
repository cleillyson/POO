package atv6_1;

import java.security.Principal;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel qua = new Quadrado(5);
        AreaCalculavel ret = new Retangulo(5, 2);
        AreaCalculavel cir = new Circunferencia(5);

        System.out.println("Area do quadrado é " + qua.calcularArea());
        System.out.println("Area do Retângulo é " + ret.calcularArea());
        System.out.println("Area da circunferencia é " + cir.calcularArea());
    }
}
