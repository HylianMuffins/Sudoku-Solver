package sudokusolver;

/**
 * The InternalBox class represents an internal box in a sudoku board. Each box
 * is 3 cells tall and 3 cells wide.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-08
 */
public class InternalBox {
    private final int xCoord;
    private final int yCoord;
    private Cell[][] cells = new Cell[3][3];

    /**
     * InternalBox constructor that creates an InternalBox instance.
     * 
     * @param xCoordinate Horizontal position of box
     * @param yCoordinate Vertical position of box
     * @param cells       2D array of cells in the box
     */
    public InternalBox(int xCoordinate, int yCoordinate, Cell[][] cells) {
        this.xCoord = xCoordinate;
        this.yCoord = yCoordinate;
        this.cells = cells;
    }

    /**
     * Getter method that returns the x coordinate of the box.
     * 
     * @return xCoord
     */
    public int getXCoord() {
        return this.xCoord;
    }

    /**
     * Getter method that returns the y coordinate of the box.
     * 
     * @return yCoord
     */
    public int getYCoord() {
        return this.yCoord;
    }

    /**
     * Getter method that returns the array of cells in the box.
     * 
     * @return cells
     */
    public Cell[][] getCells() {
        return this.cells;
    }
}