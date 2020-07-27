public class board extends sudokuSolver {


    //creates a standard sudoku board and returns the board.
    public static int[][] createBoard() {
        int[][] sudokuBoard = new int[9][9];
        return sudokuBoard;
    }
    
    //Fills a passed in sudoku board with number 1 - 9 in every row. Not random just yet.
    public static int[][] fillBoard(int[][] board){

       for (int i = 0; i < board.length; i++) {  
           for(int j = 0; j < board.length; j++){
                board[i][j] = j + 1;
            } 
       } 

       return board; 
    }
    //This prints out the state of the board to the terminal with standard sudoku borders. Does this by adding a | or -- when a number is divisible by three (and also doesn't equal 9)
    public static void printBoard(int[][] board){
         for(int i = 1; i <= board.length; i++){                                                                                                                                               
                                                                                                                                                                                                    
            for(int j = 1; j <= board.length; j++){                                                                                                                                           
                                                                                                                                                                                                    
                if (j % 3 == 0 && j != 9){                                                                                                                                                          
                    System.out.print(board[1][j - 1] + "|");                                                                                                                                  
                } if (j % 3 != 0 || j == 9){                                                                                                                                                        
                    System.out.print(board[1][j - 1]);                                                                                                                                        
                }                                                                                                                                                                                   
            }                                                                                                                                                                                       
            System.out.print("\n");                                                                                                                                                                 
            if (i % 3 == 0 && i != 9){                                                                                                                                                              
                System.out.println("-----------");                                                                                                                                                  
            }                                                                                                                                                                                       
        }    
    
   }


}
