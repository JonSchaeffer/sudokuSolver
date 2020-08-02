import java.util.*;

public class sudokuSolver {

    public static void main(String[] args) {

        int[][] sudokuBoard = board.createBoard();

        //sudokuBoard[0][0] = 1;

        sudokuBoard = board.fillBoard(sudokuBoard);


        //System.out.println(Arrays.deepToString(sudokuBoard));

        System.out.println(Arrays.deepToString(sudokuBoard).replace("], ", "]\n"));
        
        //board.printBoard(sudokuBoard);    
       
        //System.out.println(Arrays.toString(sudokuBoard[0])); 
        //System.out.println(solve.hasDuplicates(solve.getSquareN(sudokuBoard, 0))); 
        
        //System.out.println(Arrays.toString(solve.getColumnN(sudokuBoard, 3)));
        //System.out.println(Arrays.toString(solve.getSquareN(sudokuBoard, 8)));

        //System.out.println(solve.hasDuplicates(solve.getSquareN(sudokuBoard, 7)));
        
        //System.out.println(Arrays.toString(solve.getRowN(sudokuBoard, 0)));

        


    }
}
