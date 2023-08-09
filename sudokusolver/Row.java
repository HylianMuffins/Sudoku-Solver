package sudokusolver;

/**
 * The Row class represents a row in a sudoku board. Each row is 1 cell tall and
 * 9 cells wide.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-08
 */
public class Row {
    private final int rowNumber;
    private Cell[] cells = new Cell[9];

    /**
     * Row constructor that creates a row instance.
     * 
     * @param yCoordinate Vertical position of row
     * @param cells       Array of cells in the row
     */
    public Row(int yCoordinate, Cell[] cells) {
        this.rowNumber = yCoordinate;
        this.cells = cells;
    }

    /**
     * Getter method that returns the row number of the row.
     * 
     * @return rowNumber
     */
    public int getRowNumber() {
        return this.rowNumber;
    }

    /**
     * Getter method that returns the array of cells in the row.
     * 
     * @return cells
     */
    public Cell[] getCells() {
        return this.cells;
    }
}
