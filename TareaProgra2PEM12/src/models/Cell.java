
package models;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 * @version 6 de noviembre 2018
 */
public class Cell {
    
    private char letter;

    public Cell(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Cell{" + "letter=" + letter + '}';
    }
    
    
    
    
}
