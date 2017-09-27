
public class SampleClass {
  public static void doubleElements(double[] a){
    int i;
    for (i = 0; i < a.length; i++)
      a[i] = a[i]*2;
  }
    
    public static void main(String[] args) {
      
    	double[]  score = {3.5, 2.5, 10};
    	double[]  number  = {100, 200, 45, 23.5, 35.8, 12, 56.9}; 
		int index;
    	System.out.println("Original score array:" ); 
   	 for (index = 0; index < score.length; index++)
            		System.out.println(score[index] );

    	System.out.println("Original number array:" );
     	for (index = 0; index < number.length; index++)
            		System.out.println(number[index] ); 

     	doubleElements (score);
      doubleElements (number); 

	System.out.println("new score array:" ); 
    	for (index = 0; index < score.length; index++)
            		System.out.println(score[index] );

    	System.out.println("new number array:" );
     	for (index = 0; index < number.length; index++)
            		System.out.println(number[index] ); 
}//end main

}//end class

