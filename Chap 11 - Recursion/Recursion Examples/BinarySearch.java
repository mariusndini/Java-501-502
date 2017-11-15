
public class BinarySearch{
    /**
     Searches the array a for key. If key is not in the array segment, then -1 is
     returned. Otherwise returns an index in the segment such that key == a[index].
     Precondition: a[first] <= a[first + 1]<= ... <= a[last]
     */
    public static int search(int[] a, int first, int last, int key){
       int result = 0; //to keep the compiler happy.
       if (first > last){
         result = -1;
       }else{
       
       int mid = (first + last) / 2;
       
       if (key == a[mid])
         result = mid; //this is our answer.
       else if (key < a[mid])
         result = search(a, first, mid - 1, key);
       else if (key > a[mid])
         result = search(a, mid + 1, last, key);
       }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
       return result;
    }
    
    public static void main(String[] args){
       // array Index    [0  1  2  3  4   5   6   7   8   9   10  11  12  13  14]
       int myNumbers[] = {1, 5, 6, 9, 10, 15, 18, 28, 29, 32, 36, 28, 44, 54, 58};
       int key = 18;
       int answer = BinarySearch.search(myNumbers, 0, myNumbers.length - 1, key);
       System.out.println( answer );
       
    
    }//end main
}//end class
