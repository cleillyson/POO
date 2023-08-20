package atv3;
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
    double calculaGanhoAnual (){
        return (this.salario * 12);
    }
    void setDados (String nom, String dep, double sal, String reg, int... dat){
        this.nome = nom;
        this.departamento = dep;
        this.salario = sal;
        this.rg = reg;
        this.dataEntrada = new Data();
        this.dataEntrada.alteraData(dat[0], dat[1], dat[2]);
    }
    void mostraDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Salario anual: R$" + this.calculaGanhoAnual());
        dataEntrada.mostraData();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
