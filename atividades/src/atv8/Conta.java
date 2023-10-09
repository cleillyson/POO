package atv8;

abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor){
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;
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
}
