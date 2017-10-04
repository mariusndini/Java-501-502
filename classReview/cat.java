public class cat{
   int age;
   String name;
   
   
   //constructors - default
   public cat(){
      age = -1;
      name = "";
   }
   
   //constructor
   public cat(int age, String name){
      int returnVal = setAge(age);
      if(returnVal == -1){
         this.age = -1;
         System.out.println("values must be between 0 and 50");
         return;
      }
      this.name = name;
   }

   //copy constructor
   public cat(cat catToCopyFrom){
      this.age = catToCopyFrom.getAge();
      this.name = catToCopyFrom.getName();
   }
  
   //setter for age
   public int setAge(int age){
      if(age <= 50 && age > -1){
         this.age = age;
         return 1;
      }else{
         return -1;
      }
   }
   //setter for name
   public void setName(String name){
      this.name = name;
   }
   //end setters
   
   //getters
   //getter for age
   public int getAge(){
      return this.age;
   }  
   //getter for name
   public String getName(){
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
      for(int i = 0; i< count; i++){
         System.out.print("purr ");
      }
      System.out.println();
      //actual logic for making a purr sound
   }
   
   //meow method
   public void meow(){
      System.out.println("MEOW!!!!");
      //actual logic for making meow sound
   }

   //scratch method
   public void scratch(String objectToScratch){
      System.out.println("SCRATCH SCRATCHing the "+objectToScratch);
      //actual logic to attack our Hero in game. 
   }  
   
   public void sleep(int hours){
      System.out.println("I am sleeping it is now "+hours+" later.");
   }
   
   //there is no limit to the number of methods

}//end cat



