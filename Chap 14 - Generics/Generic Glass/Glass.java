
// Generic Glass
// where T can be any Object
// The class is Generic and the object type can change

class Glass<myObject>{
   // Our Glass can be filled with anything
   // we cannot set it to a specific object like Apple Juice or OJ or Milk
   // because we can fill it with any of those things.
   public myObject liquid;
 
 
   public myObject getLiquid(){
      return liquid;
   }
   
   public static void main(String[]args){
      Glass<AppleJuice> myGlass = new Glass<AppleJuice>();
      myGlass.liquid = new AppleJuice();
   
   
   }
   
}// end glass


class AppleJuice{
   String type = "Apple";
}

class OrangeJuice{
   String type = "Orange";
}

class Milk{
   String type = "cow";
}



