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
        Board testBoard = new Board();
        int[][] testCells = {
                { 5, 0, 0, 4, 6, 7, 3, 0, 9 },
                { 9, 0, 3, 8, 1, 0, 4, 2, 7 },
                { 1, 7, 4, 2, 0, 3, 0, 0, 0 },
                { 2, 3, 1, 9, 7, 6, 8, 5, 4 },
                { 8, 5, 7, 1, 2, 4, 0, 9, 0 },
                { 4, 9, 6, 3, 0, 8, 1, 7, 2 },
                { 0, 0, 0, 0, 8, 9, 2, 6, 0 },
                { 7, 8, 2, 6, 4, 1, 0, 0, 5 },
                { 0, 1, 0, 0, 0, 0, 7, 0, 8 }
        };
        testBoard.setCells(testCells);
        testBoard.showBoard();

        Solver testSolver = new Solver(testBoard);
        testSolver.solve();
        testBoard.showBoard();
    }
}