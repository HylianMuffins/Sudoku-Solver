package sudokusolver;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The UnitTesting class tests the methods of the sudoku solver program using
 * junit tests.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-08
 */
public class UnitTesting {

    public UnitTesting() {
    }

    @Test
    public void testBoardConstructorCells() {
        // Create a board for testing
        Board testBoard = new Board();

        Cell[][] testCells = testBoard.getCells();

        for (Cell[] row : testCells) {
            for (Cell cell : row) {
                int expectedValue = (cell.getXCoord() * 9) + cell.getYCoord();
                assertEquals("Expected cell value or order was not produced", expectedValue, cell.getValue());
            }
        }
    };
}
