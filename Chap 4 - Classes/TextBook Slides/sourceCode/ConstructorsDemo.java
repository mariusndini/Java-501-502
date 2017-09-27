
public class ConstructorsDemo
{
    public static void main(String[] args)
    {
        Date date1 = new Date("December", 16, 1770),
             date2 = new Date(1, 27, 1756),
             date3 = new Date(1882),
             date4 = new Date( );
				 
		Date date5 = new Date(date1);

        System.out.println("Whose birthday is " + date1 + "?");
		  System.out.println("Whose birthday is " + date5 + "?");

		  date1.setYear(2000);
		  System.out.println();
		  
        System.out.println("Whose birthday is " + date1 + "?");
		  System.out.println("Whose birthday is " + date5 + "?");

		  
       /* System.out.println("Whose birthday is " + date2 + "?");
        System.out.println("Whose birthday is " + date3 + "?");
        System.out.println("The default date is " + date4 + ".");*/
     }
}
