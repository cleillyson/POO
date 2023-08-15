package atv2;

public class Teste {
    public static void main(String[] args) {
        Questao1 funcionario = new Questao1();
        funcionario.salario = 1200;
        funcionario.departamento = "Itau";
        funcionario.rg = "1234567";
        funcionario.nome = "Marcos";
        funcionario.mostra();
        funcionario.cauculaGanhoAnual();
        funcionario.mostra();
        funcionario.recebeAumento(300);
        funcionario.mostra();


    }
}
