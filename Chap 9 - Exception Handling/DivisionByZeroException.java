import java.util.Scanner;


public class DivisionByZeroException extends Exception
{
    public DivisionByZeroException( )
    {
        super("Hi, this is our custom Div/0 Message.");
    }

    public DivisionByZeroException(String message)
    {
        super(message);
    }
    
    
    
}

class DivBy0Driver{
   public static void main(String[] args){
      try
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter numerator:"); 
            int numerator = keyboard.nextInt();
            System.out.println("Enter denominator:"); 
            int denominator = keyboard.nextInt();

            if (denominator == 0)
                throw new DivisionByZeroException( );

            double quotient = numerator/(double)denominator;
            System.out.println(numerator + "/" 
                                 + denominator 
                                 + " = " + quotient);
        }
        catch(DivisionByZeroException e)
        {
            System.out.println(e.getMessage( ));
            //secondChance( );//We can call another function if we wanted to. 
        }

        System.out.println("End of program.");
    
   
   }
}