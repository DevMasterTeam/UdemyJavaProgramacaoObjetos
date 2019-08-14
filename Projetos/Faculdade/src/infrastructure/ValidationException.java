package infrastructure;

/**
 * Exceção criada para validações
 */
public class ValidationException extends Exception {
    public ValidationException(String str) {
        super(str);
    }
}