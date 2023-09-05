package atv5;

public class Main {
    public static void main(String[] args) {
        Banco atui = new Banco(10);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
        for (int i = 0 ;i < 10 ;i++){
            if (i % 2 == 0){
                atui.adiciona(new ContaPoupanca());
            }   else {
                atui.adiciona(new ContaCorrente());
            }
            atui.pegaConta(i).deposita(1000 + 100 * i);
        }
        for (int i = 0 ;i < 10 ;i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
            adc.roda(atui.pegaConta(i));
        }
    }
}
