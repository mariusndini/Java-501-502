/*
** CHANGES
void printTable() - print array values in the table itself.
   We should now be able to populate our array and print them out like below:
              1.2.3 .
            A|x| |  .
            B| |o|  .
            C|x| |  .


** NEW METHODS:

void setXO(int location) - 
   Create setXO method which is given a location from 0-8 and places either and X or O
   in the array depending on whose turn it is. Using the isXturn variable we can figure this out.

                                   Top row
                                      |   Middle
                                      |     row    Bottom
                                      |     |      row
  our array myTable has values of [0,1,2, 3,4,5,  6,7,8] 
     1.2.3 .   |
   A|x| |  . [0,1,2]
   B| |o|  . [3,4,5]
   C|x| |  . [6,7,8]



void askUser()

void setMarker(String location)


EXPECTED OUTPUT from driver:

     1.2.3 .
 A| | |  .
 B| | |  .
 C| | |  .
 X's Turn. Where would you like to place?
 a1
   1.2.3 .
 A|x| |  .
 B| | |  .
 C| | |  .
 O's Turn. Where would you like to place?
 a2
   1.2.3 .
 A|x|o|  .
 B| | |  .
 C| | |  .
 X's Turn. Where would you like to place?
 a3
   1.2.3 .
 A|x|o|x .
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
         Create the method to print out the table below.
              1.2.3 .
            A| | |  .
            B| | |  .
            C| | |  .
      - Now that we can print the table above, replace the default space values to coincide with
         their array locations.
   */
   void printTable(){
      System.out.println("  1.2.3 .");
      System.out.println("A|"+myTable[0]+"|"+myTable[1]+"|"+myTable[2]+" .");
      System.out.println("B|"+myTable[3]+"|"+myTable[4]+"|"+myTable[5]+" .");
      System.out.println("C|"+myTable[6]+"|"+myTable[7]+"|"+myTable[8]+" .");

   }
   
   
   /*
      METHOD: resetTable()
         create the resetTable logic. 
            here you should iterate through the loop and set each value of the array to " "
            a blank space.
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
      PLEASE KEEP IN MIND THESE NEXT 3 METHODS WORK TOGETHER
   
      METHOD: setXO(Int) -
         input:
            location: Int - where in the myTable array should the x or o be place
         
         1) Takes a location (from 0-8) to places our x or o values in the array
            Array locations 0-2 is top row
            Array locations 3-5 is middle row
            Array locations 6-8 is bottom row
         2) After it sets the location it then calls setTurn() to change the turn 
   */
   void setXO(int location){
      if(isXturn){
         myTable[location] = "x";
      }else{
         myTable[location] = "o";
      }
      setTurn();

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
      //Temp var for users input
      String userInput = "";
      
      
      // * Logic for getting users input - check whose turn it is *
      
    
    
      //once we have the users input pass it to set marker to put it in the right place
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
      // the incoming location is the String value of a1, b3, c3 etc from the grid.
      // take this value and cover it. For example we know a1 = myTable[0] and b1 = myTable[3] etc
      /* our array myTable has values of [0,1,2, 3,4,5,  6,7,8] 
                 1.2.3 .   
               A|x| |  . [0,1,2]
               B| |o|  . [3,4,5]
               C|x| |  . [6,7,8] */
   }

   
}//end tic tac class

class TicTacDriver{
   public static void main(String[] args){
      TicTacToe myGame = new TicTacToe();
      myGame.printTable();
      
      myGame.askUser();
      myGame.printTable();

      myGame.askUser();
      myGame.printTable();

      myGame.askUser();
      myGame.printTable();
      
      
      
   }
}