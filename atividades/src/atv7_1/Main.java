package atv7_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Porta portaDeMadeira = new Porta(3, 1);
        portaDeMadeira.medidas();
        portaDeMadeira.fechar();
        portaDeMadeira.isAberta();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Porta portaDeMadeira2 = (Porta) portaDeMadeira.clone();
        portaDeMadeira2.medidas();
        portaDeMadeira2.abrir();
        portaDeMadeira2.isAberta();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        portaDeMadeira.isAberta();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
