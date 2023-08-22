package atv4;

public class Empresa {
    private String nome;
    private Data dataDeCriacao;
    public Funcionario[] empregados;
    private String cnpj;
    private int quantidadeFuncionarios = 0;
    public void setFuncionarios(int qnt){
        this.empregados = new Funcionario[qnt];
    }

    public void adiciona(Funcionario f){
        this.empregados[quantidadeFuncionarios] = f;
        quantidadeFuncionarios ++;
    }

    public void mostraFuncionarios(){
        for (Funcionario i : this.empregados){
            i.mostraDados();
        }
    }

    public void encontraFuncionario(String n){
        String[] resposta = {"", " não"};
        int auxiliar = 1;
        for (Funcionario i : this.empregados){
            if (i.getNome() == n){
                auxiliar = 0;
                break;
            }
        }
        System.out.printf("O %s%s é funcionário da empresa\n", n, resposta[auxiliar]);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

}
