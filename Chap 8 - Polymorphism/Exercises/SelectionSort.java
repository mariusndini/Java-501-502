/*
Selection sort is one of the simpler sort algorithms. 
It will go through the array and look for the smallest number. 
once it is found it will place it in another array and 
continute the process all over again.

*/

public class SelectionSort{
   public static int[] selectionSort(int[]a){
      //outer loop helps us find the smallest number after each iteration
      for (int i = 0; i < a.length - 1; i++){
         int index = i; // the left side of the array is sorted, the right side is unsorted
                        // the new index shifts over everytime we make the sorted side larger

         //search through the array to find the smallest number
         for (int j = i + 1; j < a.length; j++){
            if (a[j] < a[index]){
               index = j;
            }
         }//end inner for loop
         
         //swap the smallest number with the current number we are looking in the array
         int smallerNumber = a[index];  
         a[index] = a[i];
         a[i] = smallerNumber;
      }
      //return our new sorted array
      return a;
   }//end selection sort
   
   public static int[] selectionSortTwo(int[]a){
      int[] sortedArray = new int[a.length];
      
      for (int i = 0; i < a.length; i++){
         int index = i;
         //search through the array to find the smallest number
         for (int j = 0; j < a.length; j++){
            if (a[j] < a[index]){
               index = j;
            }
         }//end inner for loop
         
         sortedArray[i] = a[index];
         a[index] = Integer.MAX_VALUE;
          
      }
      return sortedArray;
   }//end
   
   public static void main(String[] args){
      int arr[] = {1, 57, 4, 25, 6, 36, 9, 18, 14};
      selectionSort(arr);
      
   }

}