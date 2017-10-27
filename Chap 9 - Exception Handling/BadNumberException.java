import java.util.Scanner;

public class BadNumberException extends Exception
{
    private int badNumber;

    public BadNumberException(int number)
    {
        super("BadNumberException - our custom message"); 
        badNumber = number; 
    }

    public BadNumberException( )
    {
        super("BadNumberException"); 
    }

    public BadNumberException(String message)
    {
        super(message); 
    }

    public int getBadNumber( )
    {
        return badNumber;
    }
}



//driver for exception

class BadNumberExceptionDemo
{

    public static void main(String[] args)
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter one of the numbers 42 and 24:"); 
            int inputNumber = keyboard.nextInt();

            if ((inputNumber != 42) && (inputNumber != 24))
                throw new BadNumberException(inputNumber);

            System.out.println("Thank you for entering " + inputNumber); 
        }
        catch(BadNumberException e)
        {
            System.out.println(e.getBadNumber( ) + " is not what I asked for.");
        }

        System.out.println("End of program.");
    }
}