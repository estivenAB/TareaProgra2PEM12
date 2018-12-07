/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSet;

/**
 *
 * @author prica
 */
public class StringMatrix {
    private char[][] array;
    private int counter;
    private char letter;

    public StringMatrix() {
        array = new char[10][10];
    }

    public StringMatrix(char[][] array) {
        this.array = array;
        this.counter = counter;
        this.letter = letter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public char getLetter(int index1, int index2) {
        return array[index1][index2];
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    
    
    
    
}
