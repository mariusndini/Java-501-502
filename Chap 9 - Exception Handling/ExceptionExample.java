public class ExceptionExample{
   public static void main(String [] args){
      int t = 10;
      int b = 0;
      
      try{
         System.out.println(  div(t, b)  );   
           
      }catch(ArithmeticException myErr){
         System.out.println("Message is : " + myErr.getMessage());

      }catch(Exception e){
         System.out.println("Error You can enter " + b);
      
      }finally{ //always going to happen, unless your code crashes
         System.out.println("Im always going to run. ");
      }  
    
      
      System.out.println("HI, please run me");
   
   }//end main
   
   // Exception is a checked exception
   // ArithmeticException is not checked
   // Checked need try/catch unchecked do not
   public static double div(int top, int bottom) throws Exception{
      
      return top/bottom;
      
   }


}//end class