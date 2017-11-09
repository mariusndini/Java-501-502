public class RecursiveDemoPower{
   public static int pow( int a, int n) {
      if ( n == 0 ) {
         return 1;
      }
      int answer = a * pow(a, n-1);
      return answer;
   }

   public static void main(String[] args){
      System.out.println(pow(2, 3));
   
   }//end void

}