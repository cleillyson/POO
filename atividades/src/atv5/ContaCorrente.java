package atv5;

public class ContaCorrente extends Conta{
    public void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }
}

