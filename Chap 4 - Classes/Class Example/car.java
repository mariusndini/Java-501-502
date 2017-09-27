//this is the class
public class car{
   //instance variables
   String type ="";
   private int year = 1900;
   private String color = "";
   private int miles = 0;
   
   //constructor
   public car(){
   
   }
   //this is called overloading!!!
   public car(String type, int year, String color, int miles){
      this.type = type; 
      this.year = year;
      this.color = color;
      this.miles = miles;
   }
 
   public car(String type, int year, String color){
      this.type = type; 
      this.year = year;
      this.color = color;
   }
   
   //Getters
   public String getType(){
      return this.type;
   }
   
   public int getYear(){
      return this.year;
   }
   
   public String getColor(){
      return this.color;
   }
   
   //Setters
   public void setType(String type){
      this.type = type;
   }
   
   public void setYear(int year){
      if(year < 2020){
         this.year = year;
      }else{
         System.out.println("Year has to be less then 2020");
      }
   }
   
   public void setColor(String color){
      this.color = color;
   }

   private void milesDividedBy10(){
      //logic here
   }
   
   //two methods have to be in every single class
   public String toString(){
      return "Type: "+ this.type + " - Color: "+color+" - Year: "+year;
   }
   
   public boolean equals(car anotherCar){
      if(anotherCar.getType().equals(this.type) &&
         anotherCar.getYear() == this.year ){
         
         return true;
      }else{
         return false;
      }
      
   }  
   
   
}
