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

    /**
     * Column constructor that creates a column instance.
     * 
     * @param xCoordinate Horizontal position of column.
     */
    public Column(int xCoordinate) {
        this.columnNumber = xCoordinate;
    }
}
