public class classesIntro{
   public static void main (String[] args){
      //Using instance variables wbich have public access.      
      car carInstance = new car();
      carInstance.type ="Honda";//carInstance is the instance - car is type. 
                              // Marius is of type person. not every person 
                              // is marius. so Marius.age is not person.age;
      carInstance.year = 2005;
      carInstance.color = "black";
      
      System.out.println("Type: " + carInstance.type + 
                         " - Year: " + carInstance.year +
                         " - Color: "+ carInstance.color);
      
      //Using a constructor - easier and made for this purpose!!! 
      car tomsCar = new car("BMW", 2018, "Red");
      System.out.println("Type: " + tomsCar.type + 
                         " - Year: " + tomsCar.year +
                         " - Color: "+ tomsCar.color);
      
      car marysCar = new car("Toyota", 2010, "Blue");
      car janesCar = new car("Buick", 2008, "Green");
      car marksCar = new car("Ford", 2009, "Purple");
      car tabathasCar = new car("BMW", 2003, "Yellow");
      
      //much faster way of printing information. 
      System.out.println(tomsCar.toString());
      System.out.println(tabathasCar.toString());
      System.out.println(marysCar.toString());
      
      
      //Question what color is x car
      System.out.println("This Color is " + tomsCar.getColor());
      
      //what if we want to change it? 
      //we need setters for that
      tomsCar.setColor("Yellow"); //Modyfying this objects data (Instance variable) 
      System.out.println("This Color is " + tomsCar.getColor());

      //an external class
      carExt anotherCar = new carExt("Ford", 2003, "Purple"); 
      System.out.println(anotherCar);
      
      //cars with arrays
      car[] cars = new car[10];
      cars[0] = carInstance;
      cars[1] = tomsCar;
      cars[2] = marysCar;
      cars[3] = janesCar;
      cars[4] = tabathasCar;
      cars[5] = new car("Ford", 2003, "Purple"); ;
      cars[6] = new car("Mercury", 2004, "green"); ;
      cars[7] = new car("Hummer", 2013, "yellow"); ;
      cars[8] = new car("Porsche", 2005, "black"); ;
      cars[9] = new car("Honda", 1999, "white"); ;
      
      
      //for loop iterating through array
      System.out.println("\n\n-Array WIll Print-");
      for(int c = 0; c < cars.length; c++){
         System.out.println(cars[c]);
      }
      
      //print all cars older then 2005
      System.out.println("\n\n-Only Cars older then 2005-");
      for(int c = 0; c < cars.length; c++){
         int year = cars[c].getYear();
         
         if(year < 2005){
            System.out.println("This is a " + cars[c].getType() 
                               + " and it is "+(2017 - cars[c].getYear())+" years old.");
         }
      }
      
      
      
   }//end main
}//end class with main

class car{
   String type = "";
   int year = 1900; 
   String color = "";
   
   //constructors
   public car(){//how a car is defined
   
   }
   
   public car(String type, int year, String color){
      this.type = type;
      this.year = year;
      this.color = color;
   }
   
   //Getters - if we want a specific item
   public String getType(){
      return type;
   } 
   
   public int getYear(){
      return year;
   }
   
   public String getColor(){
      return color;
   }
   
   //setters to set data
   public void setCar(String car){
      this.type = type;
   }
   public void setYear(int year){
      this.year = year;
   }
   public void setColor(String color){
      this.color = color;
   }
   
   //KEY: EVERY class is REQUIRED to have a toString() method otherwise a default toString() will be provided. 
   public String toString(){
      return "Type: " + type + 
             " - Year: " + year +
             " - Color: "+ color;
   }
   
}//end car class


