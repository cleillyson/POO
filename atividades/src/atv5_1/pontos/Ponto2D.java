package atv5_1.pontos;

public class Ponto2D {
    private double pontoX;
    private double pontoY;
    public void setPontos(double pX,double pY){
        this.pontoX = pX;
        this.pontoY = pY;
    }
    public String toString() {
        return "Ponto X = " + this.pontoX + "\nPonto Y = " + this.pontoY;
    }
}
