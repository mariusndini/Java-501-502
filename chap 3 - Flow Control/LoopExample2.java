public class LoopExample2{
   public static void main (String[] args){
      int answer = 0;
      for(int i=0; i < 10; i++){
         if(i%2==0){
            System.out.println(i);
            answer = answer + i;

         }
         
      
      }
      System.out.println(answer);
   
   
   }   
}