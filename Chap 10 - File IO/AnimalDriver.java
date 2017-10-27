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
      
      Dog ourDogs[] = new Dog[10];
      cat ourCats[] = new cat[10];
      int dogCounter = 0;
      int catCounter = 0;
      
      //this is our initial first line
      String line = reader.read();
      while(!line.equals("")){
         //print line so we know what we are looking at
         //System.out.println(line);
         
         //split the line in an array so we can get the values
         String ourLineSplit[] = line.split("-");
         
         if(ourLineSplit[0].equals("Dog")){
            System.out.println("This is a dog "+ ourLineSplit[1]);
            int ourDogsAge = Integer.parseInt(ourLineSplit[2]); 
            Dog ourNewDog = new Dog(ourLineSplit[1], ourDogsAge);
            
            ourNewDog.speak();
            //put dog in the array
            ourDogs[dogCounter] = ourNewDog;
            dogCounter = dogCounter + 1;
            
         }else if(ourLineSplit[0].equalsIgnoreCase("cat")){
            System.out.println("This is a cat " + ourLineSplit[1]);
         }  

         //read the next line, should alwys be last logic in our loop
         line = reader.read();
        
      }
      
      
      System.out.println("===============================");
      for(int i = 0; i < dogCounter; i++){
         System.out.println("Intro themselves");
         System.out.println(ourDogs[i].getName()+" "+ourDogs[i].getAge());
         ourDogs[i].speak();
         
         
      }


   }//end main
   
}//end driver