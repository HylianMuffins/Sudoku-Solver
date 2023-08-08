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
    private int rowNumber;

    /**
     * Row constructor that creates a row instance.
     */
    public Row(int yCoordinate) {
        this. rowNumber = yCoordinate;
    }
}
