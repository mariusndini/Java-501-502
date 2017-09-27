import java.util.Scanner;

public class BooleanOp{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
       
      int time = 7;
      int limit = 6;
      int max = 10;
         
      
      boolean answer = time < limit || limit < max;
      //boolean answer = time < limit && limit < max; //for and

      System.out.println(answer);   
         
         
   }//end main
}//end class