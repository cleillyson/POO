package atv2;

public class Questao4 {
    public static void main(String[] args) {
        Questao1 f1 = new Questao1();
        f1.nome = "Danilo";
        f1.salario = 100;

        Questao1 f2 = new Questao1();
        f2.nome = "Danilo";
        f2.salario = 100;

        if (f1 == f2){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
