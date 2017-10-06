public class FlowControlDriver
{
   public static void main (String[] args)
   {
      //vars
      int counter = 0;
   
      //***  loops ***
      //for loop
      // var init  condition  update
      for(int i=0;  i < 10;    i = i+1){
         System.out.println("For Loop " + i);
      
      }//end for loop
      
      //while loop
      // Loop will run until condition is false
      while(/*Loop Condition*/ counter < 10 && false){
         System.out.println("Hi I am in the loop " + counter);
         counter = counter + 1;
      }//end while loop
      
      
      
      //do while loop
      do{
         counter = counter + 1;
         System.out.println("Do While " + counter);
      }while(counter < 10 && false);
      
      /**********************************************/
      // If Statement 
      // switch exists, IF is more useful
      System.out.println("Checking first: " +
                     checkNumbers(add(5,9), add(3,4)+10) );
      
      if(checkNumbers(17,9)){
         System.out.println("Conditional is true");
      }else{
         System.out.println("Conditional is false");
      }
      
      System.out.println(add(5,9));
      
      
   }//end main
   
   public static boolean checkNumbers(int num1, int num2){
      return num1 < num2;
   }
   
   public static int add(int num1, int num2){
      int answer = num1 + num2;
      return answer;
   }
   
   
   
}//end driver class