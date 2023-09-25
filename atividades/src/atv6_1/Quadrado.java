package atv6_1;

public class Quadrado implements AreaCalculavel{
    float lado;
    public Quadrado(float a){
        this.lado = a;
    }
    public float calcularArea() {
        return this.lado * this.lado;
    }
}
