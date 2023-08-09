package sudokusolver;

/**
 * The Board class represents a full 9x9 sudoku board with 9 collumns, 9 rows,
 * and 9 3x3 internal boxes. I will start in an unsolved state and will be
 * solved following the sudoku puzzle rules.
 * 
 * @author Zachariah Blair
 * @version 1.0
 * @since 2023-08-08
 */
public class Board {
    private Column[] columns = new Column[9];
    private Row[] rows = new Row[9];
    private InternalBox[][] boxes = new InternalBox[3][3];
    private Cell[][] cells = new Cell[9][9];

    /**
     * Board constructor that creates a board instance.
     */
    public Board() {
        // Initialize all 81 cells
        int value = 0;
        for (int rowNumber = 0; rowNumber < this.rows.length; rowNumber++) {
            for (int columnNumber = 0; columnNumber < this.columns.length; columnNumber++) {
                cells[rowNumber][columnNumber] = new Cell(rowNumber, columnNumber);
                cells[rowNumber][columnNumber].setValue(value);
                value++;
            }
        }

        // Inititalize all 9 columns
        for (int columnNumber = 0; columnNumber < this.columns.length; columnNumber++) {
            Cell[] columnCells = new Cell[9];
            for (int row = 0; row < 9; row++) {
                columnCells[row] = this.cells[row][columnNumber];
            }
            this.columns[columnNumber] = new Column(columnNumber, columnCells);
        }

        // Initialize all 9 rows
        for (int rowNumber = 0; rowNumber < this.rows.length; rowNumber++) {
            Cell[] rowCells = this.cells[rowNumber];
            this.rows[rowNumber] = new Row(rowNumber, rowCells);
        }

        // Initialize all 9 boxes
        for (int rowNumber = 0; rowNumber < boxes.length; rowNumber++) {
            for (int columnNumber = 0; columnNumber < boxes[rowNumber].length; columnNumber++) {
                int rowStart = rowNumber * 3;
                int columnStart = columnNumber * 3;

                Cell[][] boxCells = new Cell[3][3];
                for (int row = 0; row < 3; row++) {
                    for (int column = 0; column < 3; column++){
                        boxCells[row][column] = this.cells[row + rowStart][column + columnStart];
                    }
                }

                this.boxes[rowNumber][columnNumber] = new InternalBox(rowNumber, columnNumber, boxCells);
            }
        }

    }

    /**
     * Getter method that returns the collumns on the board.
     * 
     * @return columns
     */
    public Column[] getColumns() {
        return this.columns;
    }

    /**
     * Getter method that returns the rows on the board.
     * 
     * @return rows
     */
    public Row[] getRows() {
        return this.rows;
    }

    /**
     * Getter method that returns the internal boxes on the board.
     * 
     * @return boxes
     */
    public InternalBox[][] getBoxes() {
        return this.boxes;
    }

    /**
     * Getter method that returns the cells on the board.
     * 
     * @return cells
     */
    public Cell[][] getCells() {
        return this.cells;
    }
}