/*
Polymorphism.  The main idea of polymorphism is the ability to 
               associate many meanings to one method/class, 
               making the method execute differently depending on 
               in what context the method is called.  
*/

public class FoodDriver{
   public static void main(String[] args){
     // Data    Reference    
     // Type     Var      Object
      Food    myFood = new Food();
      myFood.eat(); // eat has multiple meanings -> the context defines which one is called
      
      Pizza myPizza = new Pizza();
      myPizza.eat(); // we can call the pizza eat method
      
      
      System.out.println("++++++++++");
      // Pizza is a food (the opposite is not true)
      // Late Binding - Object Binding happens at run-time (not compile time)
      // This is saying -> Hey im still pizza but im pretending to be Food
      Food myNewPizza = new Pizza();
      myNewPizza.eat();// The interpreter is smart enough to know that this is actually Pizza       
      
      
      //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      // Down Casting - Casting a parent class (higher up the chain) to a child class (lower in the chain) 
      //   * Be Careful!!!
      //     We could be casting it as an object that it is not.
      Food myPasta = new Pasta(); // Pasta is pretending to be Food
      ((Pasta)myPasta).cook(); // Interpreter is not smart enough to know that this is Actually in the pasta class - We Tricked it.
      ((Food)myPasta).eat(); // Poly Morphism is still going to call pasta eat


      // Attempt:
      //   We will cast our Pasta to a Pizza
      //   Runtime Error: java.lang.ClassCastException: Pasta cannot be cast to Pizza
      //((Pizza)myPasta).eat(); // DOES NOT WORK !
      
      
      //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      // UP Casting - ALWAYS allowed
      // Pasta is a Food, Pizza is a Food.
      // No chance of mismatch. In Down Casting Pasta is not Pizza -> We cannot cast Pasta to Pizza
      ((Food)myPizza).eat(); //Interpreter is still smart enough to know this is pizza and not food
  
      intakeFood(myPasta);
   }//end main
   
   public static void intakeFood(Food myFood){
      System.out.println("in Intake Food");
      myFood.eat();
   }

  
}//end class