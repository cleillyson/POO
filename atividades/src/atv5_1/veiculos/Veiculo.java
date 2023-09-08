package atv5_1.veiculos;

public class Veiculo {
    private boolean ligado;
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public boolean isLigado(){
        return ligado;
    }
}
