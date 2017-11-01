public class PolyMorphismDriver{
   public static void main(String[] args){
       //we define a dog and an animal
       Dog myDog = new Dog("Woofie", 3);
       Animal myAnimal = new Animal("Animalia", "Just Barks");
   
       // here we make it speak
       myDog.speak();
       myAnimal.speak();
   
   
   
       //here we define an animal datatype with the object Dog
       Animal myNewDog = new Dog("Ruffie", 5);
       
       //here we bind Speak to the correct speak method (Dogs speak method)
       // * not animals!!
       myNewDog.speak();
       
       
       
   }//end main
}//end class