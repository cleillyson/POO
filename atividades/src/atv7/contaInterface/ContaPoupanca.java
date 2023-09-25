package atv7.contaInterface;

public class ContaPoupanca implements Conta {
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if (valor - 0.1 > 0) {
            this.saldo += valor - 0.1;
        } else {
            System.out.println("VALOR INVALIDO");
        }
    }

    public void saca(double valor){
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("VALOR INVALIDO");
        }
    }

    public void atualiza(double taxa) {
        if(taxa >= 0){
            this.saldo += taxa * 3 * this.saldo;
        }
    }

}
