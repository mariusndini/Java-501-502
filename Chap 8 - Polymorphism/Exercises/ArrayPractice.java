import java.util.Random;

public class ArrayPractice{
   public static int Sequential(int[] arr, int searchTerm){
      for(int i=0; i < arr.length; i++){
         if(arr[i] == searchTerm){
            System.out.println(searchTerm + " exists in index : "+i);
         }
      }
      return -1;
   }//end seq. search
   
   public static int HalfBinary(int[] arr, int searchTerm){
      for(int i=0; i < arr.length; i++){
         int index = i;
         
         System.out.println(arr[index]); 


      }//end for
      
      
      return -1;
   }

   public static int[] selectionSort(int[] arr){
      int sortedArray[] = new int[arr.length];
      for(int i=0; i < arr.length; i++){
         int index = i;
         
         for(int j = 0; j < arr.length; j++){
            //here we are comparing each individual number to every other number in the array (including itself) 
            if(arr[index] > arr[j]){
               index = j;
            }//end if
         }//end inner for loop
         sortedArray[i] = arr[index];
         arr[index] = Integer.MAX_VALUE;
         
      }//end for
      return sortedArray;
   }

   
   public static void main(String [] args){
      int nums[] = {10, 8, 6, 15, 30};//new int[10];
      Random r = new Random();

      nums = selectionSort(nums);     
      
      for(int i=0; i < nums.length; i++){
         System.out.println(nums[i]);
      }   
      
   }//end main
   
   
}//end array 