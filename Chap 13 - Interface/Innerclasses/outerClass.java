public class outerClass{

   // This is a class within a class
   // **NOTE: SCOPE STILL APPLIES WITH INNER CLASSES
   public class innerClass{
      public class innerInnerClass{
         int innerInnerInt = 10; //scope still applies
      }
      
      innerInnerClass IIC = new innerInnerClass();
   }// Inner class


   public innerClass IIC = new innerClass();
   
   public innerClass getIC(){
      return IIC;
   }

}// outer class


class driver{
   public static void main(String[] args){
      outerClass OC = new outerClass();
   }

}
