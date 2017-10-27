public class Dog extends Animal{
   int age;
  
   Dog(String name, int age){
      super(name, "woof"); //KEY: ALWAYS first statement 
      this.age = age;
   }
   
   void walk (){
      System.out.println("Walking the dog.");
   }
   
   public void save(){
      DB.write("Dog-"+name +"-"+age+"-"+says);
      DB.close();
   }

   
   int getAge(){
      return age;
   }
   
   String getName(){
      return name;
   }
   
   // Method Overriding
   // The Animal class speak doesnt do enough, 
   // we will re-define it.
   public void speak(){
      System.out.println(says.toUpperCase()+"!!!");
   }//end speak
   

   
   //we dont have a speak method? 

   //setters
   //getters
   //toString
   //equals

}//end dog