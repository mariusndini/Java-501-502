/*    -------- RECURSION HOMEWORK ------
  Below are some methods which require solutions.
  Each method should be solved using Recursion.
  Each Method will have a slight description on what it is doing. 

*/

public class RecursionHW{
  /* 
     Inputs - n - this is the number the user will enter to be calculated. 
                  the function will need to take all the numbers from 0 to n and
                  add them together. For Example sum(5) will output the result of 
                                     sum(5) = 1 + 2 + 3 + 4 + 5
     
     Write a recursive function that computes the sum of all 
     numbers from 1 to n, where n is given as parameter.
     return the sum 1+ 2+ 3+ ...+ n
   */
   public static int sum(int n){
      if(n==0){ // base case
         //return case - bottom of tne recursion - time to go back up
         
      }else{ // recursive process
         
      }      
   }//end sum
   
   
   /*
      inputs - a[] - An array of integers
               index - the index of the array to look for the minimum.
                       this will always default to zero to make things a bit easier.
   
   
      Write a recursive function that finds and returns 
      the minimum element in an array, where the array 
      and its size are given as parameters.
      return the minimum element in a[]
   */
   public static int min(int a[], int index){
      
      
   }//end min
   
   
   /*
      Inputs - a[] - an array of integers to sum
               n   - the index of the array to look/ add together.
         *This is a similar problem to sum function above, with a bit of a difference.
   
      Write a recursive function that computes and returns the sum 
      of all elements in an array, 
      where the array and its size are given as parameters.
      return the sum of all elements in a[]
   */
   public static int sumArray(int[]a, int index){
            
   }//end sum

   /*
   inputs - a[] = an array of integers
            first - integer which states where to start looking (Will default to zero upon start)
            last - integer which states where to end looking (will default to a.length-1 upon start)

   Write a recursive function that determines whether an array is a palindrome, 
   *A palindrom is a sequence that reads the same backward as forward)
   
   where the array and its size are given as parameters.
   ABBA is a Palindrome 
   ABA is as well
   madam is one as well
   nurses run - is one as well
   ABCDE  is * NOT *
   

*/
   public static boolean isPalindrome(int[]a, int first, int last){
      
   }// end palinrome
   
 
   /*
      DO NOT CHANGE THE CODE BELOW
      This code will test/run your methods. you may comment out portions of the code to do testing
      but when you submit your homework it should look exactly like as it is now.
   
   */
   public static void main(String[] args){
      //Array we will use for sum, min and sumArray functions
      int[] array = {10, 15, 33, 89, 17, 34, -19};
      
      // array we will use to test palindrone - Please do not change.
      int[] palendromArray = {1,2,3,4,5,6, 7, 6,5,4,3,2,1};
      
      // test sum
      System.out.println(sum(10));
      
      // test min
      System.out.println(min(array, 0));
      
      // test sumArray
      System.out.println(sumArray(array, 0));
      
      // test palindrome method
      System.out.println(isPalindrome(palendromArray, 0, palendromArray.length-1));


   }//end main

}