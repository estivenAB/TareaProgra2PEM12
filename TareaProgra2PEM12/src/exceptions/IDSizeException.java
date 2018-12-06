package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class IDSizeException extends Exception {

    public IDSizeException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public IDSizeException(String msg) {
        super("El ID no puede ser menor de 4 caracteres.");
    }
}
