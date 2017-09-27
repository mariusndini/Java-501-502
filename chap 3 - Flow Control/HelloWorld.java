import java.util.Scanner;

public class HelloWorld{
   public static void main(String[] args){
      
      //vars
      int a = 5;
      int b = 1;
      
      int answer = a + b;
      
      String output = "adding "+a+" & "+b+" gives us "+answer;
      System.out.println(output);
      
      a = 7;
      b = 9;
      answer = a + b;
      
      output = "as well as "+a+" & "+b+" gives us "+answer;
      
      System.out.println(output);
      
      a = 2;
      System.out.println("a to the power of 2 is " + (a*a) );
      
      Scanner KB = new Scanner(System.in);
      a = KB.nextInt();
      b = KB.nextInt();
      
      System.out.println(a*b+" "+ 2*(a*a) +" "+(b*b)+" "+(a/b));
      
   }//end main
}//end class