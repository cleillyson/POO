package atv2;
//Cria uma classe para cadastro de funcionario
public class Questao1 {
    String nome;
    String departamento;
    double salario;
    Questao6Data dataEntrada;
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
        //System.out.println(this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
        //Questão 8
        dataEntrada.mostraData();
    }

    void coletaData(int dia, int mes, int ano){
        dataEntrada = new Questao6Data();
        dataEntrada.alteraData(dia, mes, ano);
    }
}
