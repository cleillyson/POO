package atv5_1.veiculos;

public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Motocicleta moto = new Motocicleta();
        Onibus onibus = new Onibus();
        Veiculo[] veiculos = {carro, moto, onibus};
        for(int i = 0; i < 3; i++){
            veiculos[i].desligar();
            System.out.println(veiculos[i].isLigado());
            veiculos[i].ligar();
            System.out.println(veiculos[i].isLigado());
            System.out.println("-=-=-=-=-=-=-=");
        }
    }
}
