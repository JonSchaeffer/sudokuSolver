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

}
