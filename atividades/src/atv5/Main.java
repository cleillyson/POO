package atv5;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.printf("Saldo total R$%.2f\n", adc.getSaldoTotal());

        /*System.out.printf("Saldo da conta é R$%.2f\n", c.getSaldo());
        System.out.printf("Saldo da conta corrente é R$%.2f\n", cc.getSaldo());
        System.out.printf("Saldo da conta poupança é R$%.2f\n", cp.getSaldo());*/
    }
}
