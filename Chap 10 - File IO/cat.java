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
 
   public void save(){
      DB.write("Type:"+getClass().getName() +"-"+"Name:"+name +"-"+"Says:"+"Meow");
      DB.close();
   }
  
 
}//end cat
