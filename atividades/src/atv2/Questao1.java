package atv2;
//Cria uma classe para cadastro de funcionario
public class Questao1 {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    void recebeAumento (double aumeto){
        this.salario = this.salario + aumeto;
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
        System.out.println("Data de entrada: " + this.dataEntrada);
    }


}
