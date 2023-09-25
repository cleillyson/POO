package atv7_1;

public class Porta implements Cloneable{
    private double altura;
    private double largura;
    private boolean aberta;

    public Porta(double a, double l){
        this.altura = a;
        this.largura = l;
    }

    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }

    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }

    public void medidas() {
        System.out.println("Essa porta tem " + this.altura + " metros de altura e "
                + this.largura + " metros de largura");
    }
    public void isAberta() {
        if (this.aberta){
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
