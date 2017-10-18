public class AnimalDriver{
   public static void main(String[] args){
      Animal myAnimal = new Animal("myDog", "Animal Call");
      //System.out.println(myAnimal);

      Dog myDog = new Dog("Lassie", 3);
      cat myCat = new cat("Kittie", "Meow");
      
      //System.out.println(myDog.toString());
      myDog.speak(); //dog speak method that we override
      myCat.speak(); //animal speak method
      myCat.speak(2); //overloaded this method






   }//end main
}//end driver