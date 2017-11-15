public class ExamReviewQ1{
   //Question 1 
   public static int search(int[] a, int first, int last, int key){
      for(int i = first; i < last; i++ ){
         if(a[i] == key){
            return i;
         }//end if
      }//end for
      return -1;
   }//end question 1
   

   


   public static void main(String[] args){
      int myNumbers[] = {1,4,5,6,10};
      System.out.println("Result is: " + search(myNumbers, 2, 6, 5));
      
   }




}//end exam review 
