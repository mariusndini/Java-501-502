import java.util.Scanner;

public class TestIFelse{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("What is your age");
       
      int age = input.nextInt();
      int weight = input.nextInt();
      
      if( age >= 18 && age < 21 ){
         //yes statment
         System.out.println("You can smoke, but not drink");
      
         if(weight > 300){
            System.out.println("      But you prob shouldnt.2");
         }
      }else if (age >=21){
         //no(false) statement
         System.out.println("You can do both"); 
         if(weight > 300){
            System.out.println("      But you prob shouldnt.2");
         }
      }else{
         System.out.println("Neither");
      }
      

      

   }//end main
}//end class