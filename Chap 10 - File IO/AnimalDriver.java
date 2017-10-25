public class AnimalDriver{
   public static void main(String[] args){

      // Save Objects to File 
      Dog myDog = new Dog("Lassie", 3);
      cat myCat = new cat("Kittie");
      
      //saving cat and dog data
      //myDog.save();
      //myCat.save();
  
      //setting up our reader
      OurDBReader reader = new OurDBReader("AnimalsDB.txt");      
      
      //this is our initial first line
      String line = reader.read();
      while(!line.equals("")){
         //print line so we know what we are looking at
         //System.out.println(line);
         
         //split the line in an array so we can get the values
         String ourLineSplit[] = line.split("-");

         if(ourLineSplit[0].split(":")[1].equalsIgnoreCase("Dog")){
            Dog myDogMan = new Dog(ourLineSplit[1].split(":")[1], 
                                       Integer.parseInt(ourLineSplit[3].split(":")[1]));
            
            System.out.println(myDogMan.toString());
            
            
         }
         
         
        
        
         //read the next line, should alwys be last logic in our loop
         line = reader.read();
        
      }
      
      /*
      String line1 = reader.read();
      String line2 = reader.read();

      //converts each line into an Array split by the delimiter (here a comma)
      String line1Split[] = line1.split("-");
      String line2Split[] = line2.split("-");
      
      //now these need to split into their respective boxes as well
      System.out.println(line1Split[0]+" "+line1Split[1]+" "+line1Split[2]+" "+line1Split[3]);
      System.out.println(line2Split[0]+" "+line2Split[1]);
      
      System.out.println();//just to have a space
      System.out.println(line1Split[0].split(":")[1]+" "+
                         line1Split[1].split(":")[1]+" "+
                         line1Split[2].split(":")[1]+" "+
                         line1Split[3].split(":")[1]);
      
      
      System.out.println(line2Split[0].split(":")[1]+" "+
                         line2Split[1].split(":")[1]);
      
      */
      
      
   }//end main
   
}//end driver