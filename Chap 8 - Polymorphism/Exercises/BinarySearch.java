/*
Binary search will always do something in terms of 2's (Bi-nary). 
Meaning, it will split the array into 2 halfs and then look for you number
by cutting the Array in half again and repeating until you find your number. 

*/

public class BinarySearch {
    public static int BinarySearch(int[] a, int b) {
        
        // If the array is 0 return -1, we cant find anything in an empty array
        if (a.length == 0) {
            return -1;
        }
        
        int low = 0; //the low end of the array (the start). sometimes this could be the start position
        int high = a.length-1; //the high end of the array (the end). 
        // In the above if we had an array 500 indexs long and we know our data is between 100 and 150.
        // we could set low to 100 and high to 150 so we dont have to search the entire array
        
        while(low <= high ) {
            //get the middle to cut the array
            int middle = (low+high) /2;
        
            if (b > a[middle] ){
                low = middle + 1;
                System.out.println("In Low- "+low);

            } else if (b < a[middle]){
                high = middle - 1;
                System.out.println("In high- "+high);

            } else { // The element has been found
                return middle;
            }
        }
        return -1;
    }//end binary search
    
    
    public static void main(String[] args){
      int[]a = {1,7, 10, 15, 18, 30, 36, 46, 49, 52, 60, 71, 90, 178, 190 };
      System.out.println(BinarySearch(a, 71));
    
    }//end main
}