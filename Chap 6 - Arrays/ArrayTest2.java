import java.util.Scanner;

public class ArrayTest2{
   public static void main(String[] args){
      int[] twoDimArray = new int [15]; 
      
      for (int index=0; index < twoDimArray.length; index++){
         twoDimArray[index] = index * 3;
      }
      
      for (int index=0; index < twoDimArray.length; index++){
         System.out.println(index+" - "+twoDimArray[index]);
      }
      

      
      
           
   }
}