public class Pasta extends Food{
   // Overriding foods eat method
   public void eat(){
      System.out.println("Eating Pasta");
   } 
   
   // We have cook because we cook our own pasta
   public void cook(){
      System.out.println("Cooked Pasta");
   }
   
}