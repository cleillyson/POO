package atv3;

public class Empresa {
    String nome;
    Data dataDeCriacao;
    Funcionario[] empregados;
    String cnpj;
    int quantidadeFuncionarios = 0;
    void setFuncionarios(int qnt){
        this.empregados = new Funcionario[qnt];
    }

    void adiciona(Funcionario f){
        this.empregados[quantidadeFuncionarios] = f;
        quantidadeFuncionarios ++;
    }

    void mostraFuncionarios(){
        for (Funcionario i : this.empregados){
            i.mostraDados();
        }
    }

    void encontraFuncionario(String n){
        String[] resposta = {"", " não"};
        int auxiliar = 1;
        for (Funcionario i : this.empregados){
            if (i.nome == n){
                auxiliar = 0;
                break;
            }
        }
        System.out.printf("O %s%s é funcionário da empresa\n", n, resposta[auxiliar]);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

}
