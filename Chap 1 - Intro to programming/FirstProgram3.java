
public class FirstProgram3
{
    public static void main(String[] args)
    {    
        int answer = 0;
      
        System.out.println("1- Hello reader.");
        System.out.println("1- Welcome to Java.");
      
        System.out.println("1- Let's demonstrate a simple calculation.");
        		  
        //answer = 2 + 2;
        
        answer = (int)10;
        double number = 10.0;
        double mod = number % 3;
        
        System.out.println("1 - answer "+ answer+" and Mod : " + mod);
      
       
        double price = 19.8999999999;
        System.out.print("2- $");
                
        //formatted
        System.out.printf("%-6.2f", price);
        System.out.print(" each");
      
      
        //white space. 
        System.out.println();
        
        System.out.print("3- $");
        System.out.printf("%6.2f", price);
      
        System.out.println(" each");
      
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        
        
        
        price = 29.8;
        String name = "Magic Apple";
        System.out.printf("$%6.2f for each %s.", 
             price, name);
        System.out.println();
        System.out.println("Wow");

        
     }//end of main method
     

}
