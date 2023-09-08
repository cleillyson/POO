package atv5_1.veiculos;

public class Onibus extends Veiculo{
    public void ligar(){
        super.ligar();
        System.out.println("Ônibus ligado");
    }

    public void desligar() {
        super.desligar();
        System.out.println("Ônibus desligado");
    }
}
