package atv7.formas;

public class Quadrado implements AreaCalculavel {
    float lado;
    public Quadrado(float a){
        this.lado = a;
    }
    public float calcularArea() {
        return this.lado * this.lado;
    }
}
