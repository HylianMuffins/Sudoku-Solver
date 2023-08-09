package sudokusolver;

/**
 * The Main class Handles the execution of the sudoku solver program.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-08
 */
public class Main {

    public static void main(String[] args) {
        // Create a board for testing
        Board testBoard = new Board();

        Cell[][] testCells = testBoard.getCells();
        for (Cell[] row : testCells) {
            for (Cell cell : row) {
                System.out.println(String.valueOf(cell.getValue()));
            }
        }
    }
}