package atv5;

public class Banco {
    private static int totalDeContas = 0;
    private Conta[] contas;
    public void adiciona(Conta c){
        totalDeContas++;
    }

    public Conta pegaConta(int x){
        return new Conta();
    }

    public int pegaTotalDeContas() {
        return totalDeContas;
    }
}
