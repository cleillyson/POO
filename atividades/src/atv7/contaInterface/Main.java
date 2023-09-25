package atv7.contaInterface;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();
        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        cp.deposita(1200);
        adc.roda(cp);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        cc.deposita(1300);
        adc.roda(cc);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
