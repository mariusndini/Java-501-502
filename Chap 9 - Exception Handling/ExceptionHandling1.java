import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling1{
   
   public static void main(String[] args){
      Scanner KB = new Scanner(System.in);
      int nextInt = 0;
      
      boolean done = false;
      
      //While not done, continue running this code.
      while(!done){
         try{
            System.out.println("Enter A number");
            nextInt = KB.nextInt(); //Exception could happen here
            done = true;
         }catch(InputMismatchException exception){
            String test = KB.nextLine();
            System.out.println("Error With your input. Try Again.");
            
         }
      }// End While
      System.out.println("Number is " + nextInt);
      
      
      
   }//end main   
   
}//end exception handling