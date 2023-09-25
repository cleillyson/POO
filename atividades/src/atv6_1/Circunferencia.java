package atv6_1;

public class Circunferencia implements AreaCalculavel{
    float raio;
    public Circunferencia(float a){
        this.raio = a;
    }

    public float calcularArea() {
        return (float) (raio * raio * Math.PI);
    }
}
