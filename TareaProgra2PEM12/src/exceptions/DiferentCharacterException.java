package exceptions;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class DiferentCharacterException extends Exception {

    public DiferentCharacterException() {
    }

    /**
     *
     *
     * @param msg recibe un mensaje para ser interpretado.
     */
    public DiferentCharacterException(String msg) {
        super(msg);
    }
}
