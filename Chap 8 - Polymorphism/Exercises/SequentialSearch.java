public class SequentialSearch {
   public static int search(int[] a, int b){
      for (int i = 0; i < a.length; i++) {
         if (a[i]==b){
            return i;
         }
      }
      return -1;
   }
       
   public static void main(String[] args){
      int arr[] = {2,3,4,10,40};
      System.out.println(search(arr, 10));
   }
}