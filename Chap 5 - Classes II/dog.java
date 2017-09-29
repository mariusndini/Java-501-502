/*
Write a class called dog. 
Give it 2 instance variables called name and age

Define the constructor
Define the getters
Define the setters
Define the toString
*/

class dog{
   private String name;
   private int age;
   private int id;   
      
      
   public dog(String name, int age){
      this.name = name;
      this.age = age;
   }
   
   //getters 
   public String getName(){
      return name;
   }
   
   public int getAge(){
      return age;
   }
   
   public int getHumanYears(){
      return this.age * 7;
   } 
   
   //setters
   public boolean setName(String name){
      if(name.equals("")){
         System.out.println("Please enter a correct Name. not a blank.");
         return false;
      }else{
         this.name = name;
         return true;
      }//end if
      //more logic down here.
   } 
   
   public boolean setAge(int age){
      if(age >= 0 ){
         this.age = age;
         return true;
      }else{
         return false;
      }
   }
   
   public String toString(){
      return "name:"+name+" - age:"+age;
   }
   
}//end class dog








