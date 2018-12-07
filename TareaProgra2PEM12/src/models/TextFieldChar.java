/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JTextField;

/**
 *
 * @author prica
 */
public class TextFieldChar extends JTextField{
    
    private char letter;
    
    public TextFieldChar(char letter){
        super(letter);
        this.letter = letter;
    }
    
    public char getString(){
        return letter;
    }
}
