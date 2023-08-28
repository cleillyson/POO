package atv5;

public class ContaPoupanca extends Conta{
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }

    public void deposita(double valor) {
        super.deposita(valor - 0.1);
    }
}
