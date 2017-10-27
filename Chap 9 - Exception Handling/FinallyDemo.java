
public class FinallyDemo
{
    public static void main(String[] args)
    {
        try
        {
           exerciseMethod(-10);
           System.out.println("after exerciseMethod call in main.");

            
        }
        catch(Exception e)
        {
            System.out.println("Caught in main.");
        }
		  
		  System.out.println("after catch block in main.");

    }
	 
    public static void exerciseMethod(int n) throws Exception
    {
        try
        {
            if (n > 0) 
                throw new Exception( );
            else if (n < 0)
                throw new NegativeNumberException( );
            else 
               System.out.println("No Exception.");
            System.out.println("Still in sampleMethod.");
        }
        catch(NegativeNumberException e)
        {
            System.out.println("Caught in sampleMethod.");
        }

        finally
        {
            System.out.println("In finally block.");
        }
        System.out.println("After finally block.");
    }
}
