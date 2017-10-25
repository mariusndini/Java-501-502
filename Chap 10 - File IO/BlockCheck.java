public class BlockCheck{
    //global var
    
    public static void main(String[] args){
      int myInt = 9;
      
      //block of code
      {
         int myOtherInt = 10;
         myInt = 20;
         {
            myInt = 30;
            int myOtherOtherInt = 50;
            {
               myInt = 100;
               int myOtherOtherOtherInt = 100;
            }
            myOtherOtherOtherInt = 10;
         }
      }
      
      
      System.out.println(myInt);
    
    }
}