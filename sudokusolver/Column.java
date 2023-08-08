package sudokusolver;

/**
 * The Column class represents one column in a sudoku board. each column is 9
 * cells tall and 1 cell wide.
 * 
 * @autor Zachariah Blair
 * @version 1.1
 * @since 2023-08-08
 */
public class Column {
    private final int columnNumber;

    /**
     * Column constructor that creates a column.
     */
    public Column(int xCoordinate) {
        this.columnNumber = xCoordinate;
    }
}
