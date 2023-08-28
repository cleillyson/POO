package atv5;

public class Teste {
    public static void main(String[] args) {
        Conta pes1 = new Conta();
        ContaCorrente pes2 = new ContaCorrente();
        ContaPoupanca pes3 = new ContaPoupanca();
        System.out.println("PESSOA 1");
        pes1.deposita(1200);
        pes1.atualiza(0.2);
        System.out.printf("Seu saldo é R$%.2f\n", pes1.getSaldo());
        System.out.println("PESSOA 2");
        pes2.deposita(1200);
        pes2.atualiza(0.2);
        System.out.printf("Seu saldo é R$%.2f\n", pes2.getSaldo());
        System.out.println("PESSOA 3");
        pes3.deposita(1200);
        pes3.atualiza(0.2);
        System.out.printf("Seu saldo é R$%.2f\n", pes3.getSaldo());


    }
}
