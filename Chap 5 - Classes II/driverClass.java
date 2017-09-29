public class driverClass{
   //driver
   public static void main(String[] whateveryouwant){
      System.out.println("Hi this is my program");
      
      dog fifo = new dog("Fifo", 2); //creating a new dog
      dog lassie = new dog("lassie", 4);
      
      System.out.println(fifo.getName()+" "+fifo.getAge()+" "+fifo.getHumanYears()); //using the getters
      System.out.println(lassie.getName()+" "+lassie.getAge()+" "+lassie.getHumanYears()); //using the getters
   
      fifo.setName("Fifu");
      lassie.setAge(lassie.getAge()+1);
     
      System.out.println(fifo.getName()+" "+fifo.getAge()+" "+fifo.getHumanYears()); //using the getters
      System.out.println(lassie.getName()+" "+lassie.getAge()+" "+lassie.getHumanYears()); //using the getters
   
   
      System.out.println("===========================\n");
   
      dog anotherDog = fifo;
      
      System.out.println(anotherDog);
      anotherDog.setName("AnotherDog");
      System.out.println(anotherDog);
      System.out.println(fifo);
      
      changeName(fifo);
      System.out.println(anotherDog);
      System.out.println(fifo);
      
      System.out.println((fifo.getAge()+"").equals(fifo.getName()));
      
      int age = 10;
      changeInt(age);
      System.out.println(age);
   }
   
   public static void changeName(dog myDog){
      myDog = null;

      myDog.setName("inChangedName");
   }
   
   public static void changeInt(int myInt){
      myInt = 0;
   }

}
