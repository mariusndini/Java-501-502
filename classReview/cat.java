public class cat{
   //instance vars
   int age;
   String name;
   
   //have to be careful because we cannot make more then 
   //20 cats - our array has a limit of 20 cats. 
   static cat allCatslist[] = new cat[20];
   static int counter = 0;
    
   //constructors - default
   public cat(){
      Debug.print("Cat - Default Con");
      age = -1;
      name = "";
      
      allCatslist[counter] = this;
      counter++;
   }
   
   //constructor
   public cat(int age, String name){
      Debug.print("Cat - Con (int, String)");
      int returnVal = setAge(age);
      if(returnVal == -1){
         this.age = -1;
         System.out.println("values must be between 0 and 50");
         return;
      }
      this.name = name;
      
      allCatslist[counter] = this;
      counter++;
   }

   //copy constructor
   public cat(cat catToCopyFrom){
      Debug.print("Cat - Copy Con");

      this.age = catToCopyFrom.getAge();
      this.name = catToCopyFrom.getName();
      
      allCatslist[counter] = this;
      counter++;
   }
  
   //setter for age
   public int setAge(int age){
      Debug.print("Cat - SetAge()");

      if(age <= 50 && age > -1){
         this.age = age;
         return 1;
      }else{
         return -1;
      }
   }
   //setter for name
   public void setName(String name){
      Debug.print("Cat - SetName");

      this.name = name;
   }
   //end setters
   
   //getters
   //getter for age
   public int getAge(){
      Debug.print("Cat - GetAge");

      return this.age;
   }  
   //getter for name
   public String getName(){
      Debug.print("Cat - GetName");
      return name;
   }
   //end getter
  
   
   //class toString
   public String toString(){
      return "Cats age is: "+age+", cats name is: "+name;
   }
   
   //equals to method - every class needs this i was too lazy to do it
   
   //purr method
   public void purr(int count){
      Debug.print("Cat - Purr");
      for(int i = 0; i< count; i++){
         System.out.print("purr ");
      }
      System.out.println();
      //actual logic for making a purr sound
   }
   
   //meow method
   public void meow(){
      Debug.print("Cat - Meow");
      System.out.println("MEOW!!!!");
      //actual logic for making meow sound
   }

   //scratch method
   public void scratch(String objectToScratch){
      Debug.print("Cat - Scratch");
      System.out.println("SCRATCH SCRATCHing the "+objectToScratch);
      //actual logic to attack our Hero in game. 
   }  
   
   public void sleep(int hours){
      Debug.print("Cat - Sleep");
      System.out.println("I am sleeping it is now "+hours+" later.");
   }
   
   //there is no limit to the number of methods
   public static void getAllCats(){
      for(int i = 0; i < counter; i = i+1){
         System.out.println(allCatslist[i].getName());
      }//end for
   }
   
   public cat test(){
      return new cat(3,"Test Cat");
   }


   
}//end cat



