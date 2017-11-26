public class outerClass{ // level 0 - highest level

   // This is a class within a class
   // **NOTE: SCOPE STILL APPLIES WITH INNER CLASSES
   public class innerClass{// level 1
      
      public class innerInnerClass{ // level 2
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
