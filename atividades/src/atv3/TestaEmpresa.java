package atv3;

public class TestaEmpresa {
    public static void main(String[] args) {
        int qntFunc = 5;
        String[][] funcionarios = {
                {"João", "Pedro", "Marcos", "Paulo", "Dantas"},
                {"Caixa", "Limpeza", "Caixa", "Caixa", "Limpeza"},
                {"154256-78", "125436-78", "123456-90", "903456-78", "174536-78"}
        };
        Empresa padaria = new Empresa();
        padaria.setFuncionarios(qntFunc);

        for (int i = 0; i < qntFunc; i++){
            Funcionario f = new Funcionario();
            f.setDados(funcionarios[0][i], funcionarios[1][i],
                    1000 + 100 * i, funcionarios[2][i],
                    10, 3, 2023 - i);
            padaria.adiciona(f);
        }
        padaria.mostraFuncionarios();
        padaria.encontraFuncionario("Matias");
    }
}
