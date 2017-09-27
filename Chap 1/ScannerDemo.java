import java.util.Scanner;

public class ScannerDemo{
   public static void main (String[] args){
      //int  age = 32;
      Scanner KB = new Scanner(System.in);
      System.out.println("Hi i will add 2 numbers for you");
   
      System.out.println("What is your first number:");
      int numberOne = 0;
      numberOne = KB.nextInt();
      
      System.out.println("What is your second number:");
      int numberTwo = KB.nextInt();
      
      int answer = numberOne + numberTwo;
      System.out.println("Your answer is: " + answer);
   
   }//end main class 

}//end of class