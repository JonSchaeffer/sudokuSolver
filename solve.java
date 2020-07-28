import java.util.*;

public class solve extends sudokuSolver {

    public static boolean hasDuplicates(int[] board){
   
       Set<Integer> numCollection = new HashSet<Integer>(); 

           for (int i = 0; i < board.length; i++){
                if(numCollection.contains(board[i]))return true;{
                    numCollection.add(i); 
                } 
            } 

       return false; 
    }
    //returns a specified column by number of column (1-9)
    public static int[] getColumnN(int[][] board, int columnNum){
      
        int[] column = new int[9];

        for(int i = 0; i < board.length; i++){
           column[i] = board[i][columnNum]; 
        }


       return column; 
    }


    //This function returns an array with the values from a specified square (0 - 8). 
    public static int[] getSquareN(int[][] board, int squareNum){
        


        if(squareNum == 0){
        
            int square[] = {board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]};
            return square; 
        }
        
        if(squareNum == 1){
        
            int square[] = {board[0][3], board[0][4], board[0][5], board[1][3], board[1][4], board[1][5], board[2][3], board[2][4], board[2][5]};
            return square; 
        }
        
        if(squareNum == 2){
        
            int square[] = {board[0][6], board[0][7], board[0][8], board[1][6], board[1][7], board[1][8], board[2][6], board[2][7], board[2][8]};
            return square; 
        }
        
        if(squareNum == 3){
        
            int square[] = {board[3][0], board[3][1], board[3][2], board[4][0], board[4][1], board[4][2], board[5][0], board[5][1], board[5][2]};
            return square; 
        }
        
        if(squareNum == 4){
        
            int square[] = {board[3][3], board[3][4], board[3][5], board[4][3], board[4][4], board[4][5], board[5][3], board[5][4], board[5][5]};
            return square; 
        }
        
        if(squareNum == 5){
        
            int square[] = {board[3][6], board[3][7], board[3][8], board[4][6], board[4][7], board[4][8], board[5][6], board[5][7], board[5][8]};
            return square; 
        }
        
        if(squareNum == 6){
        
            int square[] = {board[6][0], board[6][1], board[6][2], board[7][0], board[7][1], board[7][2], board[8][0], board[8][1], board[8][2]};
            return square; 
        }
        
        if(squareNum == 7){
        
            int square[] = {board[6][3], board[6][4], board[6][5], board[7][3], board[7][4], board[7][5], board[8][3], board[8][4], board[8][5]};
            return square; 
        }
        
        if(squareNum == 8){
        
            int square[] = {board[6][6], board[6][7], board[6][8], board[7][6], board[7][7], board[7][8], board[8][6], board[8][7], board[8][8]};
            return square; 
        }
        return null;
    }

}
