public class functions{
   //variable scope
   // variables usually live and die in the breaces they are initialized in {}
   // {           <-brace starts  
   //   int a=0   <-variable is initialized/born
   // }           <-variable dies (It no longer exists in memeory) 
   //* KEY Braces inside the initial braces will have access to this variable. 
   
   static int importantVariable  = 14;
   public static void main (String[] args){
      int result = add(3,4);
      int number1 = 13;
      int number2 = 6;
      
      print("A void method just performs an action");
      
      System.out.println(result);
      System.out.println(multi(number1, number2));
      
      //when evaluated the result is either if(true) or if(false) because isAGreater returns a boolean
      if(isAGreater(number1, number2)){
         System.out.println("A is greater");
      }
      
      getImpVal();
      
      
   }
   
   static void print(String out){
      System.out.println(out);
   }
   
   //function to add numbers together.
   // IGNORE STATIC - it is needed here because Main is a static method. 
   // under normal circumstances it is not needed (unless you do need it and you know why!)
   static int add(int a, int b){
      return a + b;
   }
   
   static int multi(int a, int b){
      return a*b;
   }
   
   static boolean isAGreater(int a, int b){
      return a > b;
   }
   
   static void getImpVal(){
      System.out.println("Important val: " + importantVariable);
   }
   
}