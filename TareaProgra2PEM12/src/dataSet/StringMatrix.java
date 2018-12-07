/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSet;

import models.Cell;

/**
 *
 * @author prica
 */
public class StringMatrix {
    private Cell[][] array;
    private int counter;
    private Cell letter;

    public StringMatrix() {
        array = new Cell[10][10];
    }

    public StringMatrix(Cell[][] array) {
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

    public Cell getLetter(int index1, int index2) {
        return array[index1][index2];
    }

    public void setLetter(Cell letter) {
        this.letter = letter;
    }
    
    
    
    
    
}
