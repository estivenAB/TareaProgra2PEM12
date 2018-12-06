package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class SameIDException extends Exception {

    public SameIDException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public SameIDException(String msg) {
        super("Ya existe un usuario con ese ID. Intente otra vez.");
    }
}
