package atv5_1.pontos;

public class Main {
    public static void main(String[] args) {
        Ponto2D p2d = new Ponto2D();
        Ponto3D p3d = new Ponto3D();
        p2d.setPontos(20, 30);
        p3d.setPontos(10, 15, 35);
        System.out.println(p2d);
        System.out.println("-=-=-=-=-=-=-=");
        System.out.println(p3d);

    }
}
