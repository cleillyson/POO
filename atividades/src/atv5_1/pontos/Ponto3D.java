package atv5_1.pontos;

public class Ponto3D extends Ponto2D{
    private double PontoZ;

    public void setPontos(double pX, double pY, double pZ) {
        super.setPontos(pX, pY);
        this.PontoZ = pZ;
    }
    public String toString() {
        return super.toString() + "\nPonto Z = " + this.PontoZ + "\n";

    }
}
