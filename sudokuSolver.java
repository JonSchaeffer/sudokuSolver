public class sudokuSolver {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[][] sudokuBoard = board.createBoard();

        sudokuBoard[0][0] = 1;

        System.out.println(sudokuBoard[0][0]);
    }
}