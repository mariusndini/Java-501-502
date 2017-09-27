import java.util.Scanner;

public class SwitchTest{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("What is your age");
       
      int age = input.nextInt();
   
      switch(age){
         case 1:
            System.out.println("Congrats. its your first birthday");
            break;//without a break, it will continue until it hits a brea
         case 16:
            System.out.println("congrats. you can drive.");
            break;
        case 18:
            System.out.println("congrats. you can do anything BUT drink.");
            break;
       case 21:
            System.out.println("congrats. you can do anything.");
            break;
       default:
            System.out.println("Nothing special at this age");     
         
      }
   
   }//end main
}//end class