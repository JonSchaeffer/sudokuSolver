import java.util.*;

public class board extends sudokuSolver {


    //creates a standard sudoku board and returns the board.
    public static int[][] createBoard() {
        int[][] sudokuBoard = new int[9][9];
        return sudokuBoard;
    }
    
    //Fills a passed in sudoku board with number 1 - 9 in every row. Not random just yet.
    public static int[][] fillBoard(int[][] board){
    
        Random rand = new Random();

       /*for(int i = 0; i < board.length; i++) {  
           for(int j = 0; j < board.length; j++){
                board[i][j] = 0;
            }

        }*/

        for(int k = 0; k < 2/*board.length*/; k++){
            List<Integer> usedNumbers = new ArrayList<>();
            usedNumbers.removeAll(usedNumbers);
            System.out.println("Row " + k + " " + Arrays.toString(board[k]));
            for(int j = 0; j < 9 /*board[k].length*/; j++){  
                int squareNum = getSquareNum(k, j);
                boolean numAdded = false;
                while (numAdded == false){
                
            
                int randSudokuInt = rand.nextInt(9) + 1; 
                
                //System.out.println("Row " + k + " " + usedNumbers + " " + randSudokuInt);

                //System.out.println(Arrays.toString(board[0]));
                //System.out.println(Arrays.toString(board[1]));
                //System.out.println("New Number: " + randSudokuInt);
                    
                board[k][j] = randSudokuInt;
                if(!usedNumbers.contains(randSudokuInt)){ 
                    board[k][j] = randSudokuInt;
                    //System.out.println("Rand has not been used");
                }

                if(usedNumbers.contains(randSudokuInt)){
                    //System.out.println("Used");
                } 
                
                if(solve.hasDuplicates(solve.getRowN(board, k)) == false && solve.hasDuplicates(solve.getColumnN(board, j)) == false && solve.hasDuplicates(solve.getSquareN(board, squareNum)) == false){
                    usedNumbers.add(board[k][j]);
                    //System.out.println("Number has been added to used list");
                    numAdded = true;
                }

                //System.out.println("Row: " + k); 
                
                if(solve.hasDuplicates(solve.getRowN(board, k)) == true && solve.hasDuplicates(solve.getColumnN(board, j)) == true && solve.hasDuplicates(solve.getSquareN(board, squareNum)) == true && usedNumbers.size() == 7){
                    //System.out.println("There is a duplicate");
                    System.out.println("Out of options");    
                    j = 0;
                    usedNumbers.removeAll(usedNumbers);
                    for(int z = 0; z < board[k].length; z++){
                        board[k][z] = 0;
                    }
                    break;
                } 

                }  
            } 

       }

         

       return board; 
    }
    //This prints out the state of the board to the terminal with standard sudoku borders. Does this by adding a | or -- when a number is divisible by three (and also doesn't equal 9)
    public static void printBoard(int[][] board){
         for(int i = 1; i <= board.length; i++){                                                                                                                                               
                                                                                                                                                                                                    
            for(int j = 1; j <= board.length; j++){                                                                                                                                           
                                                                                                                                                                                                    
                if (j % 3 == 0 && j != 9){                                                                                                                                                          
                    System.out.print(board[i - 1][j - 1] + "|");                                                                                                                                  
                } if (j % 3 != 0 || j == 9){                                                                                                                                                        
                    System.out.print(board[i - 1][j - 1]);                                                                                                                                        
                }                                                                                                                                                                                   
            }                                                                                                                                                                                       
            System.out.print("\n");                                                                                                                                                                 
            if (i % 3 == 0 && i != 9){                                                                                                                                                              
                System.out.println("-----------");                                                                                                                                                  
            }                                                                                                                                                                                       
         }    
   

        /*for(int i = 1; i <= board.length; i++){
           //System.out.print(Arrays.toString(board[i - 1]));
            for(int j = 1; j <= board[i].length; j++){
            System.out.print(board[i - 1][j - 1]);
            }
        
        }*/ 
    
    }


    public static int getSquareNum(int row, int col){
            
            int squareRow = 0;    
            int squareNum = 0;
            

            if(row <= 2)
                squareRow = 1;
            
            if(row >= 3 && row <= 5)
                squareRow = 2;
            
            if(row >= 6 && row <= 8)
                squareRow = 3;
   
            
            if(squareRow == 1 && col <= 2)
                squareNum = 0;

            if(squareRow == 1 && col >= 3 && col <= 5)
                squareNum = 1; 
                
            if(squareRow == 1 && col >= 6 && col <= 8)
                squareNum = 2;

            if(squareRow == 2 && col <= 2)
                squareNum = 3;

            if(squareRow == 2 && col >= 3 && col <= 5)
                squareNum = 4; 
                
            if(squareRow == 2 && col >= 6 && col <= 8)
                squareNum = 5;

            if(squareRow == 3 && col <= 2)
                squareNum = 6;

            if(squareRow == 3 && col >= 3 && col <= 5)
                squareNum = 7; 
                
            if(squareRow == 3 && col >= 6 && col <= 8)
                squareNum = 8;


            return squareNum;
    }


     public static int[][] buildRow(int[] input[], int row){
   
        Random rand = new Random();
        int col = 0;

        for(int i = 0; i < input.length; i++){
       
                    
            
        }     
     
    



        return null;        
    }
}
