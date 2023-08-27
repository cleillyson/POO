package atv2;
//Cria uma classe para cadastro de funcionario
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;
    void recebeAumento (double aumento){
        this.salario = this.salario + aumento;
    }
    double cauculaGanhoAnual (){
        return (this.salario * 12);
    }
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Salario anual: R$" + this.cauculaGanhoAnual());
        dataEntrada.mostraData();
    }

    void coletaData(int dia, int mes, int ano){
        dataEntrada = new Data();
        dataEntrada.alteraData(dia, mes, ano);
    }
}
