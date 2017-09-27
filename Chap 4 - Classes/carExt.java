public class carExt{
   String type = "";
   int year = 1900; 
   String color = "";
   
   //constructors
   public carExt(){//how a car is defined
   
   }
   
   public carExt(String type, int year, String color){
      this.type = type;
      this.year = year;
      this.color = color;
   }
   
   //Getters - if we want a specific item
   public String getCar(){
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
   
}
