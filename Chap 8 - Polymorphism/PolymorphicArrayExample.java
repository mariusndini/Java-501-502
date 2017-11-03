public class PolymorphicArrayExample{
   public static void main (String[] args){
      Food myDB[] = new Food[5];
      myDB[0] = new Food();
      myDB[1] = new Food();
      
      //insert pasta
      myDB[2] = new Pasta();
      myDB[3] = new Pizza();
      myDB[4] = new Pasta();
        
      for(int i = 0; i < myDB.length; i++){
         System.out.println(myDB[i]);
      
      }
   
  
   }//end main


}//end example