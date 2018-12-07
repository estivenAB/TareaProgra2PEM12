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
        super("No se permite el uso de caracteres distintos a letras, ni implementar dos letres en un solo espacio.");
    }
}
