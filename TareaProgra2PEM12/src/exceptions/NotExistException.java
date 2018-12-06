package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class NotExistException extends Exception {

    public NotExistException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public NotExistException(String msg) {
        super("No se encontró ese ID o contraseña, inténtelo nuevamente.");
    }
}
