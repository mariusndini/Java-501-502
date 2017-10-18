public class driver{
   public static void main(String[] args){
      //question 2
      Rectangle rect[] = new Rectangle[5];
      rect[0] = new Rectangle(3,4);
      rect[1] = new Rectangle(45,2);
      rect[2] = new Rectangle(10,14);
      rect[3] = new Rectangle(300,487);
      rect[4] = new Rectangle(312,407);
   
      //System.out.println(average(num));

      //Driver for question 3
      Rectangle rect1 = new Rectangle(3,4);
      Rectangle rect2 = new Rectangle(5,10);
      Rectangle rect3 = rect1.merge(rect2);

      Rectangle rect4 = rect3.merge(rect2);
      
      
      
      System.out.println(rect4.getWidth());
      System.out.println(rect4.getLength());
      System.out.println(rect4.area());
      
      //System.out.println(rect1.getLength());
      //System.out.println(rect1.getWidth());
      
      
      //System.out.println();
      
      rect1.setLength(10);
      rect1.setWidth(20);

      //System.out.println(rect1.getLength());
      //System.out.println(rect1.getWidth());
      //System.out.println(rect1.area());

      //System.out.println(Rectangle.totalArea(rect));   
      
   }//end main
   
   static double average(int numbers[]){
      int sum = 0;
      for(int i = 0; i < numbers.length; i++){
         sum = sum + numbers[i];
      }//end for
   
      double average = sum/numbers.length;
      return average;
   }
   
   
   
}