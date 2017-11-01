public class CastingExample{
   public static void main(String[] args){
      Object myAge = 15;
      myAge = ((int)myAge) + 1;
      System.out.println(myAge);   
   
      Object myName = "Marius";
      
      System.out.println(  ((int)myName)  );
   
   
   }// main
}// class