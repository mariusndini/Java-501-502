import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling0{
   
   public static void main(String[] args){
      Scanner KB = new Scanner(System.in);
      int nextInt = KB.nextInt();
      
      System.out.println("Took one input, now will take another.");
      try{
         nextInt = KB.nextInt();
      }catch(InputMismatchException exception){
         System.out.println("Error With your input.");
      }
   
   
   }//end main   
   
}//end exception handling