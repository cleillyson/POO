package atv8_1;

public class Main {
    public static void main(String[] args) {
        Object o = null;
        try {
            o.toString();
        } catch (NullPointerException e){
            System.out.println("O método toString não pode ser invocado pois \"o\" é vazio.");
        }

    }
}
