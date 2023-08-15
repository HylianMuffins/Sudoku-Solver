package sudokusolver;

/**
 * The Column class represents a column in a sudoku board. Each column is 9
 * cells tall and 1 cell wide.
 * 
 * @autor Zachariah Blair
 * @version 1.1
 * @since 2023-08-08
 */
public class Column {
    private final int columnNumber;
    private Cell[] cells;

    /**
     * Column constructor that creates a column instance.
     * 
     * @param xCoordinate Horizontal position of column
     * @param cells       Array of cells in the column
     */
    public Column(int xCoordinate, Cell[] cells) {
        this.columnNumber = xCoordinate;
        this.cells = cells;
    }

    /**
     * Getter method that returns the collumn number of the column.
     * 
     * @return columnNumber
     */
    public int getColumnNumber() {
        return this.columnNumber;
    }

    /**
     * Getter method that returns the array of cells in the column.
     * 
     * @return cells
     */
    public Cell[] getCells() {
        return this.cells;
    }

}
