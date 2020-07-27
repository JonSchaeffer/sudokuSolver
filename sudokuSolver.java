import java.util.Arrays;


public class sudokuSolver {

    public static void main(String[] args) {

        int[][] sudokuBoard = board.createBoard();

        //sudokuBoard[0][0] = 1;

        sudokuBoard = board.fillBoard(sudokuBoard);

        //System.out.println(Arrays.deepToString(sudokuBoard).replace("], ", "]\n"));
        
        //board.printBoard(sudokuBoard);    
       
        
        int[][] testBoard = board.createBoard();
        testBoard[0][0] = 1;
        testBoard[0][1] = 1;



        System.out.println(Arrays.toString(testBoard[0])); 
        System.out.println(solve.hasDuplicates(testBoard[0])); 
    }
}
