public class array2DDriver{
   public static void main(String[] args){
      int cardHolder[][] =  new int [3][5];
      
      addNumbers(cardHolder);
      
      
      //iterating through a 2D array
      for(int x = 0; x < cardHolder.length; x++){
         System.out.println(cardHolder[x][0]);
         System.out.println(cardHolder[x][1]);
         System.out.println(cardHolder[x][2]);
      }
   }//end main
   
   //end addNumbers to make it easy to give numbers to the array
   public static void addNumbers(int myArr[][]){
      for(int x = 0; x < myArr.length; x++){
         for(int y = 0; y < myArr[x].length; y++){
            myArr[x][y] = (int)(Math.random()*100);
            System.out.print(myArr[x][y]+" ");
         }//end inner for
         System.out.println();
      }//end outter for
      System.out.println("End of Array \n");
   
   }//end function
}