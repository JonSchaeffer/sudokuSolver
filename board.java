public class board extends sudokuSolver {

    public static int[][] createBoard() {
        int[][] sudokuBoard = new int[9][9];
        return sudokuBoard;
    }

    public static int[][] fillBoard(int[][] board){

       for (int i = 0; i < board.length; i++) {  
           for(int j = 0; j < board.length; j++){
                board[i][j] = j;
            } 
       } 

       return board; 
    }

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
