import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo{

   public static void main(String[] args){
   
      ArrayList<String> toDoList = new ArrayList<String>(5);
      System.out.println( "Enter list entries, when prompted." );
      boolean done = false;
      String next = null;
      String answer;
      Scanner keyboard = new Scanner(System.in);

      while ( !done ){
          System.out.println("Input an entry:");
          next = keyboard.nextLine( );
          toDoList.add(0, next);

          if (next.equalsIgnoreCase("quit")){
                done = true;
         }
      }

      System.out.println("The list contains:");
      for (String entry : toDoList){
         System.out.println(entry);
      }//end for  
      
      for(int i = 0; i < toDoList.size(); i++){
         System.out.println(toDoList.get(i));

      }
      
      int lists[] = {0,1,23,3,4,5,6,6,67,4,3,3};
      for(int myInt : lists){
         System.out.println(myInt);
      }
      
      
      
       
   }
}
