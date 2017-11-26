
//Glass class
class Glass{
   // Our Glass can be filled with anything
   // we cannot set it to a specific object like Apple Juice or OJ or Milk
   // because we can fill it with any of those things.
   public Object liquid;
   
   public static void main(String[] args){
      Glass myGlass = new Glass();
      myGlass.liquid = new AppleJuice();
      
      // We are returning an object that MUST be cast to apple juice
      // -- AppleJuice myJuice = myGlass.liquid; <- Glass.java:13: error: incompatible types: Object cannot be converted to AppleJuice
      
      AppleJuice myJuice = (AppleJuice)myGlass.liquid;
      
   }//end main

}// end glass

/* **** REMEMBER: just because all of these classes are in the same file
                  it does not mean they are all connected. 
                  Assume as if they were all in different files.
   ** Only in one file for easy of demostration.
*/

class AppleJuice{
   String type = "Apple";
}

class OrangeJuice{
   String type = "Orange";
}

class Milk{
   String type = "cow";
}



