import java.util.Scanner;

public class LoopExample{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      
      
      System.out.println("Please enter your Pin");
      int pin = in.nextInt();
      int checkedPin = 1111;
      int dollars = 5000000;
               
      if(pin == checkedPin){
         boolean wantsMoreTransactions = true;
         while(wantsMoreTransactions){
            System.out.println("What would you like to do.\n "+
                     "\tEnter W for withdraw \n"+
                     "\tEnter B for check bal \n"+
                     "\tEnter T for Transfer.");
            String action = in.next();
            
            if(action.equals("W")){
               System.out.println("How much would you Like?");
               int withdrawlValue = in.nextInt();
               if(withdrawlValue <= dollars){
                  dollars = dollars - withdrawlValue;
                  System.out.println("Take your money, Bal - " + dollars);
               }else {
                  System.out.println("youre not that rich.");
               }
               //withdraw
            }else if(action.equals("B")){
               System.out.println("b");
               //check balance
            }else if(action.equals("T")){
               System.out.println("transfer");
            }
            
            System.out.println("Would you like another transaction");
            String transAnswer = in.next();
            if(transAnswer.equals("Y")){
               wantsMoreTransactions = true;
            }else{
              wantsMoreTransactions = false;
              System.out.println("Dont forget your card.");
            }
            
         }//ends while loop
         
         
      }else{
         System.out.println("Im keeping your card");
      }
      
      
      
      
      /*
      for(int counter = 0; true; counter = counter + 1){
         //body
         System.out.println("Hi, this is number: "+ counter);
      }//end for loop
      */
   
   }//end main
}//end class   
   