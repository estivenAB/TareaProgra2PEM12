package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class SamePasswordException extends Exception {

    public SamePasswordException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public SamePasswordException(String msg) {
        super("Ya existe un usuario con esa contraseña. Intente otra vez.");
    }
}
