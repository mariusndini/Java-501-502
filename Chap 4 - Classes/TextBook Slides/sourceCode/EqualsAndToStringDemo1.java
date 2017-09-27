
public class EqualsAndToStringDemo1
{
    public static void main(String[] args)
    {
        DateFourthTry date1 = new DateFourthTry( ),
                      date2 = new DateFourthTry( );
                      
                      
                      
        date1.setDate(6, 17, 1882);
        
       // date1.writeOutput();
        
        System.out.println("date1 = " + date1);
        
        
        date2.setDate(6, 17, 1882);
        
         System.out.println("date2 = " + date2);
        
        
        if (date1.equals(date2))
            System.out.println(date1 + " equals " + date2);
        else
            System.out.println(date1 + " does not equal " + date2);

       date1.setDate(7, 28, 1750);
       
         System.out.println("date1 = " + date1);
         System.out.println("date2 = " + date2);

         
        if (date1.precedes(date2))
            System.out.println(date1 + " comes before " + date2);
        else
            System.out.println(date2 + " comes before or is equal to " 
                                     + date1);
   }
}
