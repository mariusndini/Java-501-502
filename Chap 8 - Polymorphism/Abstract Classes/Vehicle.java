/*
   Absttact Class - partially defines a method
                    the child classes are then required to 
                    define the abstract class. 
  
  
  *** WE CANNOT HAVE AN INSANCE OF THIS CLASS !!!
  Vehicle myCar = new Vehicle("Toyota") -> illegal                  
*/

public abstract class Vehicle{
   String make;
   
   Vehicle (String make){
      this.make = make;
   }  
   
   void getMake(){
      System.out.println(this.make);
   }
   
   /*
      Every child which inherits from Vehicle will NEED to define this class
   */
   public abstract void drive();

   

}