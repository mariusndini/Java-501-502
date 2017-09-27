public class classExample{
   static int numberOne = 9;
   static int numberTwo = 10;

   public static void main (String[] args){
      System.out.println("Hello Program");
      
      int result;
      
      add(numberOne, 3);
      System.out.println(numberOne+" "+numberTwo);
      
      System.out.println("This is the End!");
      
      /*
      int counter;
      if(true){
         counter = 10;
         System.out.println(counter);
      }
      
      if(true){
         counter = 20;
         System.out.println(counter);
         int bookCounter = 30;
         if(true){
            bookCounter = 100;
            System.out.println(counter+" "+bookCounter);
         }
      }
      
      System.out.println(bookCounter);
      */
      
   }//end main
   
   //function 
   static void add(int num1, int num2){
      int result = num1 + num2;
      //return result;
      
   }
   
   static int multi(int a, int b){
      int result = a * b;
      return result;
   }
   
   
   
   
   
   
}//end class




