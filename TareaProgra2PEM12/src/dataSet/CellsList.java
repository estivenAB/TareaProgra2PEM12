package dataSet;

import models.Cell;


/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 * @version 6 de noviembre 2018
 */
public class CellsList {

    private Cell[] cellsList; 
    private int counter;

    public CellsList(Cell[] cellsList, int counter) {
        this.cellsList = cellsList;
        this.counter = counter;
    }

    public Cell[] getCellsList() {
        return cellsList;
    }

    public void setCellsList(Cell[] cellsList) {
        this.cellsList = cellsList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "CellsList{" + "cellsList=" + cellsList + ", counter=" + counter + '}';
    }
    
    public void addCell(Cell cellToAdd) {
        if (cellToAdd != null) {
            if (counter == cellsList.length) {
                enlargeList(cellsList);
            }
            if (counter == 0) {
                cellsList[0] = cellToAdd;
                counter++;
            } else {
                for (int i = counter; i >= 0; i--) {
                    cellsList[i + 1] = cellsList[i];
                }
                cellsList[0] = cellToAdd;
                counter++;
            }

        }
    }

    public void enlargeList(Cell[] cellsList) {
        if (counter >= cellsList.length) {
            Cell[] auxCellList = new Cell[cellsList.length + 1];
            for (int i = 0; i < cellsList.length; i++) {
                auxCellList[i] = cellsList[i];
            }
            auxCellList = cellsList;
        }
    }
    
    
}
