// https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
public class innerClassExample{
 /*** OUR INNER CLASS ***/
   public class adder{
      int ourCalcTax = 3;
      int add(int a, int b){
         return ( a+b ) - ourCalcTax;
      }//end add method
      
      // 3rd level inner class
      public class myInnerInner{
         int mySecret = 4323;
         public int getSecret(){
            return mySecret;
         }
      }
       
   }//end adder class   
 /*** End INNER CLASS ***/
   
   
   
   private adder ourAdder;
   // constructor
   public innerClassExample(){
      this.ourAdder = new adder();
   }
   
   public int ourSpecialAdd(int a, int b){
      return ourAdder.add(a, b);
   }

 /* OUR MAIN METHOD */
   public static void main (String[] args){
      innerClassExample myClass = new innerClassExample();
      System.out.println(myClass.ourSpecialAdd(5, 10));
      
   }//end main
}//end inner class example



