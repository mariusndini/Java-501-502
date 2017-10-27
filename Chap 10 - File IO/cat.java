public class cat extends Animal{
   cat(String name){
      super(name, "Meow");
   }
      
   // METHOD OVERLOADING
   // we can still have the old method and the new method
   // but the paramater list has to be different
   public void speak(int numberOfTimes){
      for(int i = 0; i < numberOfTimes; i = i + 1){
         super.speak();
      }
   }//end speak  
 
   //method save overriden
   public void save(){
      super.DB.write("cat" +"-"+name +"-"+"Meow");
      super.DB.close();
   }
  
 
}//end cat
