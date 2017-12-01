// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
// Array List Documentation


import java.util.ArrayList;
public class ArrayListIntro{
   public static void main(String[]args){
      // An array list is a generic. Generics are given what type of 
      // class they intake. in this case a String
      ArrayList<String> myList = new ArrayList<String>();

      //Array lists are like arrays but a little bit better/different
      
      //set an Element
      myList.add("Hi");
      myList.add("Hi Again");
      myList.add("Hi 3 times");
      //myList.add(1,"Moving 2"); //pushes index value up one 
      
      
      //get an element
      System.out.println(myList.get(0));
      System.out.println(myList.get(1));
      System.out.println(myList.get(2));

      //set an element
      myList.set(0, "Changed Value");
      System.out.println("--"+myList.get(0));
      
      // Array Lists Have Classes
      
      
      
   }// end main


}// end class