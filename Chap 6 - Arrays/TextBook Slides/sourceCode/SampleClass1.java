
public class SampleClass1 {

  public static int[]  incrementArray(int[] a, int increment){
     int[] temp = new int[a.length];
     int i;
     for (i = 0; i < a.length; i++)
        temp[i] = a[i] + increment;
     return temp;
 }
    
    public static void main(String[] args) {
      
    	int[]  score = {3, 2, 10};
    	int[]  number  = {100, 200, 45, 2, 35, 12, 56}; 
		int index;

    	System.out.println("Original score array:" ); 
   	 for (index = 0; index < score.length; index++)
            		System.out.println(score[index] );

    		System.out.println("Original number array:" );
     	for (index = 0; index < number.length; index++)
            		System.out.println(number[index] ); 

     	int[] newScore = incrementArray (score,10);
      int[] newNumber = incrementArray (number,100); 

	System.out.println("new score array: "); 
    	for (index = 0; index < newScore.length; index++)
            		System.out.println(newScore[index] );

    	System.out.println("new number array: ");
     	for (index = 0; index < newNumber.length; index++)
            		System.out.println(newNumber[index] ); 

    }//end main
}//end class

