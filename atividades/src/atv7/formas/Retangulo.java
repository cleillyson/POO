package atv7.formas;

public class Retangulo implements AreaCalculavel {
    float largura;
    float altura;
    public Retangulo(float a, float b){
        this.largura = a;
        this.altura = b;

    }
    public float calcularArea() {
        return this.largura * this.altura;
    }
}
