package atv8;

public class ValorInvalidoException extends RuntimeException{
    ValorInvalidoException(double valor) {
        super("Valor invalida: " + valor);
    }
}
