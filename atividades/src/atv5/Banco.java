package atv5;

public class Banco {
    private int totalDeContas = 0;
    private Conta[] contas;
    public Banco(int qntContas){
        this.contas = new Conta[qntContas];
    }
    public void adiciona(Conta c){
        this.contas[this.totalDeContas] = c;
        this.totalDeContas++;
    }

    public Conta pegaConta(int x){
        return this.contas[x];
    }

    public int pegaTotalDeContas() {
        return totalDeContas;
    }
}
