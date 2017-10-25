/*
CHANGES:
Read the comments and fill in the code
When the driver is finished running the output should be the below
   1.2.3 .
   A| | |  .
   B| | |  .
   C| | |  .

*/


import java.util.Scanner;

public class TicTacToe{
   /*
      INSTANCE VARS:
         myTable: an array of length 9. used to store table values of (x's and o's)
         isXturn: a boolean which keeps track of whose turn it is. if it is X's turn then X goes, otherwise it is O's turn
         gameOver: A boolean which keeps track of the game is over or still being played
         KB: a Scanner type which will be used for user input
  */
  
  //INSTANCE VARIABLES
   private String helloStudents = "Hello, below here is where your variables should be";
   
   
   /*
      DEFAULT CONSTRUCTOR: -TicTacToe
         call resetTable() - to reset our game and initialize our array default values
         initalize KB
         set isXturn to true (we will assume that X goes first)
         set gameOver to false. 
   */
   TicTacToe(){



   }
   
   
   /*
      Method: printTable()
         Create the method to print out the table below.
              1.2.3 .
            A| | |  .
            B| | |  .
            C| | |  .
            
      - Obserive how the table is printed. This can be accomplished with 4 print statements
   */
   void printTable(){


   }
   
   
   /*
      Method: resetTable()
         create the resetTable logic. 
            here you should iterate through the loop and set each value of the array to " "
            a blank space.
   */
   void resetTable(){
      
   }
   

   
   
}//end tic tac class

class TicTacDriver{
   public static void main(String[] args){
      TicTacToe myGame = new TicTacToe();
      myGame.printTable();
      
   }
}