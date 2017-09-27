//this is a driver!!!

public class introToClasses{
   public static void main (String[] args){
      System.out.println("Intro To Classes - Part 1");
      car cars[] = new car[10];
      
      car tomsCar = new car("BMW",2016, "Red");
      cars[0] = tomsCar;
      String t = tomsCar.type;
      
      car amysCar = new car("BMW",2017, "Red");
      cars[1] = amysCar;
      
            //String type, int year, String color, int miles
      cars[2] = new car("Benz", 2010, "Blue", 1900);
      cars[3] = new car("BMW", 2009, "Yellow");
                 
      System.out.println(tomsCar);
      nullCar(tomsCar);
      System.out.println(tomsCar);

      
   }//end main
   
   static boolean nullCar(car anotherCar){
      anotherCar.setColor("Black");
      return true;
   }
   
}//end class



