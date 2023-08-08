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
    
    /**
     * Board constructor that creates a board instance.
     */
    public Board() {
        // Inititalize all 9 columns
        for (int columnNumber = 0; columnNumber < this.columns.length; 
            columnNumber++) {
                this.columns[columnNumber] = new Column(columnNumber);
        }

        // Initialize all 9 rows
        for (int rowNumber = 0; rowNumber < this.rows.length; rowNumber++) {
            this.rows[rowNumber] = new Row(rowNumber);
        }

        // Initialize all 9 boxes
        for (int rowNumber = 0; rowNumber < boxes.length; rowNumber++) {
            for (int columnNumber = 0; boxes[rowNumber].length < 3;
                columnNumber++) {
                    this.boxes[rowNumber][columnNumber] = 
                        new InternalBox(rowNumber, columnNumber);
            }
        }

    }
}