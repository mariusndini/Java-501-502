public class RecursivePower{
   public static int pow( int a, int n) {
      if ( n == 0 ) {
         return 1;
      }
      int answer = a * pow(a, n-1);
      return answer;
   }//end power

   public static void main(String[] args){
      System.out.println(pow(2, 5));
   
   }//end void

}