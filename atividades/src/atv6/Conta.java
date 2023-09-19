package atv6;

abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor){
        if (valor > 0) {
            this.saldo += valor;
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

    abstract void atualiza(double taxa);
    /*{
        if (taxa > 0) {
            this.saldo += taxa * this.saldo;
        }
    }
*/

}
