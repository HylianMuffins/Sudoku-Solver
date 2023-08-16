package sudokusolver;

/**
 * The solver class houses the logic and algorithms used to solve sudoku boards.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-15
 */
public class Solver {
    private Board board;

    /**
     * Solver constructor that automatically assigns a board to be solved.
     * 
     * @param unsolvedBoard
     */
    public Solver(Board unsolvedBoard) {
        this.board = unsolvedBoard;
    }

    /**
     * Solver constructor that does not assign a board.
     */
    public Solver() {
    }

    /**
     * Getter method that returns the board in its current state.
     * 
     * @return board
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Setter method that sets the board for a solver without one or just to change
     * the existing board.
     * 
     * @param newBoard
     */
    public void setBoard(Board newBoard) {
        this.board = newBoard;
    }

    /**
     * Method that takes any unsolved Board and attempts to fill in the empty cells
     * with correct values in order to solve the board. It will return the solved
     * board.
     * 
     * @return board
     */
    public Board solve() {

        int emptyCellCount = 81;

        for (Cell[] row : this.board.getCells()) {
            for (Cell cell : row) {

                // skip filled cells
                if (cell.getValue() != " ")
                    emptyCellCount--;
            }
        }

        int cellCountTab = emptyCellCount;

        while (emptyCellCount != 0) {
            this.board.showBoard();
            for (Cell[] row : this.board.getCells()) {
                for (Cell cell : row) {

                    // skip filled cells
                    if (cell.getValue() != " ")
                        continue;

                    // analyse row
                    checkRow(cell);
                    if (checkIsFilled(cell)) {
                        emptyCellCount--;
                        this.board.showBoard();
                        continue;
                    }

                    // analyse column
                    checkColumn(cell);
                    if (checkIsFilled(cell)) {
                        this.board.showBoard();
                        emptyCellCount--;
                        continue;
                    }

                    // analyse box and update # of empty cells
                    checkBox(cell);
                    if (checkIsFilled(cell)) {
                        this.board.showBoard();
                        emptyCellCount--;
                    }
                }
            }

            // stop infinite loops before they happen
            if (cellCountTab == emptyCellCount)
                break;
            else
                cellCountTab = emptyCellCount;
        }
        return this.board;
    }

    /**
     * This method accepts any cell on the board and evaluates how the other numbers
     * in its row affect its possible values.
     * 
     * @param cell
     */
    private void checkRow(Cell cell) {
        int rowNumber = cell.getYCoord();
        Row row = this.board.getRows()[rowNumber];

        for (Cell comparedCell : row.getCells()) {
            // remove other numbers in row from this cell's options
            if (comparedCell.getValue() != " ")
                cell.removeOption(Integer.parseInt(comparedCell.getValue()));
        }
    }

    /**
     * This method accepts any cell on the board and evaluates how the other numbers
     * in its column affect its possible values.
     * 
     * @param cell
     */
    private void checkColumn(Cell cell) {
        int columnNumber = cell.getXCoord();
        Column column = this.board.getColumns()[columnNumber];

        for (Cell comparedCell : column.getCells()) {
            // remove other numbers in row from this cell's options
            if (comparedCell.getValue() != " ")
                cell.removeOption(Integer.parseInt(comparedCell.getValue()));
        }
    }

    /**
     * This method accepts any cell on the board and evaluates how the other numbers
     * in its box affect its possible values.
     * 
     * @param cell
     */
    private void checkBox(Cell cell) {
        int boxX = (cell.getXCoord() - (cell.getXCoord() % 3)) / 3;
        int boxY = (cell.getYCoord() - (cell.getYCoord() % 3)) / 3;
        InternalBox box = this.board.getBoxes()[boxY][boxX];

        for (Cell[] comparedCellSection : box.getCells()) {
            for (Cell comparedCell : comparedCellSection) {
                // remove other numbers in row from this cell's options
                if (comparedCell.getValue() != " ")
                    cell.removeOption(Integer.parseInt(comparedCell.getValue()));
            }
        }
    }

    /**
     * This method checks to see if a cell has only one possible option, and if so
     * assigns it as its value.
     * 
     * @param cell
     * @return isFilled
     */
    private Boolean checkIsFilled(Cell cell) {
        Boolean isFilled = false;
        if (cell.getOptions().size() == 1) {
            cell.setValue(cell.getOptions().get(0));
            isFilled = true;
        }

        return isFilled;
    }

}