public class Animal extends Object{
   String name; //by deault these are all protected
   String says;
   
   public Animal (String name, String says){
      this.name = name;
      this.says = says;
   }
   
   public void speak(){
      System.out.println(says);
   }  
   
   //Here we are overridng the toString of Object (the master Object in Java)
   public String toString(){
      return "My name is " + name + " and I say " + says;
   }
   
   
   //getters
   //setters
   //equals

}


