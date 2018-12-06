package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class PasswordSizeException extends Exception {

    public PasswordSizeException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public PasswordSizeException(String msg) {
        super("La contraseña no puede ser menor de 3 caracteres.");
    }
}
