package atv2;

public class Questao7 {
    public static void main(String[] args) {
        Questao1 func = new Questao1();
        func.nome = "Roberto";
        func.dataEntrada = new Questao6Data();
        func.dataEntrada.dia = 2;
        func.dataEntrada.mes = 10;
        func.dataEntrada.ano = 2003;
        System.out.println(func.dataEntrada.dia + "/" + func.dataEntrada.mes + "/" + func.dataEntrada.ano);
    }
}
