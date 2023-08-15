//Instancia da classe funcionario na questão 1
package atv2;


public class Questao2 {
    public static void main(String[] args) {
        Questao1 func1 = new Questao1();//Questao1 classe do funcionario
        func1.salario = 1200;
        func1.departamento = "RH";
        func1.rg = "1234567";
        func1.nome = "Marcos";
        //func1.dataEntrada ="01/02/2020";
        System.out.println("Nome: " + func1.nome);
        System.out.println("Salario: R$" + func1.salario);
        func1.cauculaGanhoAnual();
        System.out.println("Salario anual: R$" + func1.cauculaGanhoAnual());
        func1.recebeAumento(300);
        System.out.println("Salario: R$" + func1.salario);
    }
}
