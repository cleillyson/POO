package atv1;

public class Questao7 {
    public static void main(String[] args) {
         int soma = 0;
         int primeiro = 0;
         int segundo = 1;

        while (primeiro <= 100) {
             System.out.println(primeiro);
             soma = primeiro + segundo;
             primeiro = segundo;
             segundo = soma;
         }
        System.out.println(primeiro);

    }
}
