
public class ToyClass
{
    private String name;
    private int number;

    public void set(String newName, int newNumber)
    {
        name = newName;
        number = newNumber;
    }

    public String toString( )
    {
        return (name + " " + number);
    }

    public void makeEqual(ToyClass anObject)
    {
        anObject.name = this.name;
        anObject.number = this.number;
    }

    public void tryToMakeEqual(int aNumber)
    {
        aNumber = this.number;
    }

    public boolean equals(ToyClass otherObject)
    {
        return ( (name.equals(otherObject.name))
                  && (number == otherObject.number) );
    }


    public static void main(String[] args)
    {
        ToyClass object1 = new ToyClass( ), 
                 object2 = new ToyClass( );
						
        object1.set("Scorpius", 1);
        object2.set("John Crichton", 2);
		  
        /*System.out.println("Value of object2 before call to method:");
        System.out.println(object2);
		  
        object1.makeEqual(object2);
		  
        System.out.println("Value of object2 after call to method:");
        System.out.println(object2);*/

        int num = 42;
        System.out.println("Value of aNumber before call to method: " + num);
        object1.tryToMakeEqual(num);
        
        System.out.println("Value of aNumber after call to method: " + num);
    }
}
