package atv7.formas;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel qua = new Quadrado(5);
        AreaCalculavel ret = new Retangulo(5, 2);

        System.out.println("Area do quadrado é " + qua.calcularArea());
        System.out.println("Area do Retângulo é " + ret.calcularArea());
    }
}
