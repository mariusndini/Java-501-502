public class MathFunctions{
   static double pi = 3.1456;

   public static double getCircumference(double radius){
      return 2 * pi * radius;
   }
   
   public static double getArea(double radius){
      return pi * (radius * radius);
   }
   
   public static double getSphereArea(double radius){
      return 4 * pi * (radius * radius);
   }


}//end our math class