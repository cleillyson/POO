package atv8;

public class ContaPoupanca extends Conta {
    public void atualiza(double taxa) {
        if(taxa >= 0){
            super.saldo += taxa * 3 * super.saldo;
        }
    }
    public void deposita(double valor) {
        super.deposita(valor - 0.1);
    }
}
