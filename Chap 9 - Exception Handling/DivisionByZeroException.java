import java.util.Scanner;


public class DivisionByZeroException extends Exception
{
    //instane var
    int userInputNumber;
   
    public DivisionByZeroException(int number)
    {
        super("Hi, this is our custom Div/0 Message.");
        userInputNumber = number;
    }

    public DivisionByZeroException(String message)
    {
        super(message);
    }
    
    public int getUserInput(){
      return userInputNumber;
    }
     
}// exception class


// below here is the driver
class DivBy0Driver{
   public static void main(String[] args){
      //some code ere
     
      try
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter numerator:"); 
            int numerator = keyboard.nextInt();
            System.out.println("Enter denominator:"); 
            int denominator = keyboard.nextInt();

            if (denominator == 0)
                throw new DivisionByZeroException( denominator );

            double quotient = numerator/(double)denominator;
            System.out.println(numerator + "/" 
                                 + denominator 
                                 + " = " + quotient);
        }
        catch(DivisionByZeroException error)
        {
            System.out.println(error.getMessage() +" the number you entereted was: "
                                  +error.getUserInput());
                                  
            secondChance( );//We can call another function if we wanted to. 
        }catch (Exception exp){
        
        
        }
        
        //some other code here
        System.out.println("End of program.");
    
   
   }
   
   public static void secondChance(){
      System.out.println("We can give the user a second chance.");
   }
}