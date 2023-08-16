package sudokusolver;

import java.util.ArrayList;

/**
 * The Cell class represents a cell in a sudoku board. Each cell contains a
 * single number from 1 to 9.
 * 
 * @author Zachariah Blair
 * @version 1.1
 * @since 2023-08-08
 */
public class Cell {
    private final int xCoord;
    private final int yCoord;
    private ArrayList<Integer> options = new ArrayList<>();
    private int value;

    /**
     * Cell constructor that creates a cell instance.
     * 
     * @param xCoordinate Horizontal position of the cell
     * @param yCoordinate Vertical position of the cell
     */
    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoord = xCoordinate;
        this.yCoord = yCoordinate;
        this.value = 0;
        for (int i = 1; i < 10; i++)
            this.options.add(Integer.valueOf(i));
    }

    /**
     * Getter method that returns the x coordinate of the cell.
     * 
     * @return xCoord
     */
    public int getXCoord() {
        return this.xCoord;
    }

    /**
     * Getter method that returns the y coordinate of the cell.
     * 
     * @return yCoord
     */
    public int getYCoord() {
        return this.yCoord;
    }

    /**
     * Getter method that returns the value of the cell.
     * 
     * @return value
     */
    public String getValue() {
        String returnString = " ";

        if (this.value != 0) {
            returnString = String.format("%d", this.value);
        }        
        return returnString;
    }

    /**
     * Getter method that returns the possible values of the cell.
     * 
     * @return options
     */
    public ArrayList<Integer> getOptions() {
        return this.options;
    }

    /**
     * Setter method that sets the value of the cell.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public void removeOption(int value) {
        ArrayList<Integer> optionsCopy = new ArrayList<>(this.options);
        for (Integer option : optionsCopy) {
            if (option.intValue() == value)
                this.options.remove(option);
        }
    }

}