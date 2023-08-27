package atv2;

public class main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.salario = 1200;
        func1.departamento = "RH";
        func1.rg = "1234567";
        func1.nome = "Marcos";
        func1.coletaData(2,6,2004);
        func1.mostra();
    }
}
