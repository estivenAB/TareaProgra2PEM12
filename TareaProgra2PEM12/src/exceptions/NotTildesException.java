package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class NotTildesException extends Exception {

    public NotTildesException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public NotTildesException(String msg) {
        super("No se permite el uso de tildes, inténtelo nuevamente.");
    }
}
