package sudokusolver;

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
    private int value;

    /**
     * Cell constructor that creates a cell instance.
     * 
     * @param xCoordinate Horizontal position of the cell.
     * @param yCoordinate Vertical position of the cell.
     */
    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoord = xCoordinate;
        this.yCoord = yCoordinate;
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
    public int getValue() {
        return this.value;
    }

    /**
     * Setter method that sets the value of the cell.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

}