// The "Interface1And2Test" class.
public class Interface1And2Test extends Object 
implements Interface1, Interface2{

    public static void main (String[] args){
   	// If I comment out the next line this
   	// program will compile and run, otherwise
   	// it won't even compile
   	System.out.println( Interface.ANSWER );
   	System.out.println( "The line after ANSWER" );
    } // main method

} // Interface1And2Test class
