public class CarDriver{
   public static void main (String[] args){
      Ford myFord = new Ford();  
      
      //Not allowed -> Is an abstract class
      //Vehicle myCar = new Vehicle("Ford");
     
      //we can call its methods if we would like
      myFord.getMake();
      carMethod(myFord);
   }
   
   public static void carMethod(Vehicle car){
      System.out.println(car);
   }
}