package atv4;

//Cria uma classe para cadastro de funcionario
public class Funcionario {
    private static int quantidadeDeFuncionarios;
    private int identificador;
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    public Funcionario(){
        this.identificador = ++Funcionario.quantidadeDeFuncionarios;
    }
    public Funcionario(String nom) {
        this.nome = nom;
        this.identificador = ++Funcionario.quantidadeDeFuncionarios;
    }
    public void recebeAumento (double aumento){
        this.salario = this.salario + aumento;
    }
    public double calculaGanhoAnual (){
        return (this.salario * 12);
    }
    public void setDados (String dep, double sal, String reg, int... dat){
        this.departamento = dep;
        this.salario = sal;
        this.rg = reg;
        this.dataEntrada = new Data();
        this.dataEntrada.alteraData(dat[0], dat[1], dat[2]);
    }

    public void setNome(String nom){
        this.nome = nom;
    }
    public void mostraDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Salario anual: R$" + this.calculaGanhoAnual());
        dataEntrada.mostraData();
        System.out.println("Código do funcionário: " + this.identificador);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public String getNome(){
        return this.nome;
    }
}
