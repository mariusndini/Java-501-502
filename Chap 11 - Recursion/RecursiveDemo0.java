public class RecursiveDemo0{

   // Recursive Method - A method which calls itself
   public static void recurMethod(int arg){
      if(arg==0){ //termination logic
         System.out.println("End of the line. GOING UP.");
      }else{ //Recursive statement
         int nextArg = arg - 1;
         System.out.println("Here we go! - Round "+nextArg);
         recurMethod(nextArg);//recursive call
         System.out.println("That was fun. Finished Round "+nextArg);

      }
   }//end recursive method

  


   public static void main (String[]args){
      recurMethod(5);
      //extra logic  
   }//end main
   
}//end class