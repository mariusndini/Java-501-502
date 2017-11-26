/*
** CHANGES
   we have to do some clean up. One Major flaw in our 
   logic is that a user can overrite prior set 
   values in the array
   
   setXO() - Only make changes if the current value 
             in the Array locatin is " " otherwise
             that location is taken.
   
   setMarker(String location) - We are handling if the user gives us correct values. 
             we should check if the user is not giving us the correct value. 
   
   

** NEW METHODS:

   playGame() - this is our main game manager 
                and where everything will happen.
   
      
   WeHaveWinner() - this method tell us whether we have a winner or not. 
         if we do, the game is over. if we do not the game continues.   
      
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
   private String myTable[] = new String[9];
   private boolean isXturn; //turn will either be X or O
   private boolean gameOver;
   private Scanner KB;
   
   
   /*
      DEFAULT CONSTRUCTOR: -TicTacToe
         call resetTable() - to reset our game and initialize our array default values
         initalize KB
         set isXturn to true (we will assume that X goes first)
         set gameOver to false. 
   */
   TicTacToe(){
      resetTable();
      KB = new Scanner(System.in);
      isXturn = true;
      gameOver = false;
   }
   
   
   /*
      Method: printTable()
         Prints the table in its current state with values
   */
   void printTable(){
      System.out.println("  1.2.3 .");
      System.out.println("A|"+myTable[0]+"|"+myTable[1]+"|"+myTable[2]+" .");
      System.out.println("B|"+myTable[3]+"|"+myTable[4]+"|"+myTable[5]+" .");
      System.out.println("C|"+myTable[6]+"|"+myTable[7]+"|"+myTable[8]+" .");

   }
   
   
   /*
      METHOD: resetTable()
         Inserts default values into array
   */
   void resetTable(){
      for(int i = 0; i < myTable.length; i++){
         myTable[i] = " ";
      }
   }
   
   
   
   /*
      METHOD: setTurn()
         Handles whose turn it is.
            if isXturn is true then sets it to false (making it O's turn)
            if isXturn is false then sets it to true (making it X's turn)
   */
   private void setTurn(){
      if(isXturn){
         isXturn = false;
      }else{
         isXturn = true;
      }
   }
   
   /*
   
      METHOD: setXO(Int) -
         input:
            location: Int - where in the myTable array should the x or o be place
            
         FIX: before setting the table we need to check if the spot in the array is empty
              we need to check if the current value is " ". if true then set the location to
              X or O
   */
   void setXO(int location){
          
     // if current array index is " " (empty String) then do the logic below.    
         if(isXturn){
            myTable[location] = "x";
         }else{
            myTable[location] = "o";
         }
         setTurn();
      //else
         // printTable()
         // tell the user that this spot is already taken
         // ask for user Input again
   }
   
    /*
      METHOD: askUser() -
      This method takes the users input and passes it to setMarket(userInput)
      
      in the method we will check if it is X's or O's turn
      if X's turn:
         X's Turn. Where would you like to place?
      else:
         O's Turn. Where would you like to place?
    */
   
   void askUser(){
      String userInput;
      
      if(isXturn){
         System.out.println("X's Turn. Where would you like to place?");
      }else{
         System.out.println("O's Turn. Where would you like to place?");
      }
      
      userInput = KB.nextLine();
      setMarker(userInput);
   }

    /*
      METHOD: setMarker(String location) -
         takes the users inputLocation (eg a1, a3 or b1 etc) and converts it to the correct array value
         and that value is passed to setXO where the applicable X or O is placed in the array
      input:
            location: String - the users choice from the grid (eg a1, a2 a3 etc)

    */
   void setMarker(String location){
      if(location.equalsIgnoreCase("a1")){
         setXO(0);
      }else if(location.equalsIgnoreCase("a2")){
         setXO(1);
      }else if(location.equalsIgnoreCase("a3")){
         setXO(2);
      }else if(location.equalsIgnoreCase("b1")){
         setXO(3);
      }else if(location.equalsIgnoreCase("b2")){
         setXO(4);
      }else if(location.equalsIgnoreCase("b3")){
         setXO(5);
      }else if(location.equalsIgnoreCase("c1")){
         setXO(6);
      }else if(location.equalsIgnoreCase("c2")){
         setXO(7);
      }else if(location.equalsIgnoreCase("c3")){
         setXO(8);
      }
      
   }
   
   /*
      METHOD: playGame() -
         this is our main game manager which handles the state of our game
   */
   
   void playGame(){
      /* Check if game is still happening. 
         while gameOver is false keep playing:
            in the loop call
            printTable() - so the user can see the table in its current state
            askUser() - to ask the user where to place their X or O */
      
      while( !gameOver){
         printTable();
         askUser();
      }
   }

   
}//end tic tac class

class TicTacDriver{
   public static void main(String[] args){
      TicTacToe myGame = new TicTacToe();
      myGame.playGame();
      
      
      
   }
}