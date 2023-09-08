package atv5_1.veiculos;

public class Automovel extends Veiculo{
    public void ligar(){
        super.ligar();
        System.out.println("Automóvel ligado");
    }

    public void desligar() {
        super.desligar();
        System.out.println("Automóvel desligado");
    }
}
