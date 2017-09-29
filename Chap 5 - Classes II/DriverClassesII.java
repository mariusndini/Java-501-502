
public class DriverClassesII{
   public static void main(String[] args){
      //Static method and static variables
      System.out.println(MathFunctions.pi);
      System.out.println(MathFunctions.getCircumference(20));
      
      //pass by value examples
      car tomsCar = null;
      tomsCar = new car("BMW", 2017, "Red");
      car anotherCar = tomsCar;
      System.out.println("Data Is: " + tomsCar+" "+anotherCar);
      
      //set the color of another car and print out toms car
      anotherCar.setColor("Green");
      System.out.println(tomsCar.getColor());
      
      //what if we delete another car? 
      anotherCar = null; //this will delete the memory reference. but not the actual object
      System.out.println(tomsCar);
      
      
         
      
   }//end main
   
   
   
}//end driver classes