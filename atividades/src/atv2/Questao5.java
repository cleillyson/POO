package atv2;

public class Questao5 {
    public static void main(String[] args) {
        Questao1 f1 = new Questao1();
        f1.salario = 1200;

        Questao1 f2 = new Questao1();
        f2.salario = 1200;

        if (f1.salario == f2.salario){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
