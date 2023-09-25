package atv6;

public class ContaCorrente extends Conta {
    public void atualiza(double taxa) {
        if(taxa >= 0){
            super.saldo += taxa * 2 * super.saldo;
        }
    }
}

