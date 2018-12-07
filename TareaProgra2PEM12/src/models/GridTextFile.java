package models;

import javax.swing.JTextField;

/**
 *
 * @author maikol
 */
public class GridTextFile extends JTextField {

    private Cell cell;

    public GridTextFile(Cell cell) {
        this.cell = cell;
    }
    
    public Cell getCell(){
        return cell;
    }

}
