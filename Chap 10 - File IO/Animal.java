

public class Animal extends Object{
   String name; //by deault these are all protected
   String says;
   
   protected OurDBWriter DB;
   
   public Animal (String name, String says){
      this.name = name;
      this.says = says;
      
      DB = new OurDBWriter("AnimalsDB.txt");
   }
   
   public void save(){
      DB.write("Animal-"+""+name +"-"+says);
      DB.close();
   }   
   
   public void speak(){
      System.out.println(says);
   }  
   
   //Here we are overridng the toString of Object (the master Object in Java)
   public String toString(){
      return "My name is " + name + " and I say " + says;
   }

}


