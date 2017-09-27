public class javaIntro{
   public static void main (String[] args){
      /*
      boolean	   true or false	false	1 bit	true, false
      byte	      twos complement integer	0	8 bits	(none)
      char	      Unicode character	\u0000	16 bits	'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
      short	      twos complement integer	0	16 bits	(none)
      int	      twos complement integer	0	32 bits	-2, -1, 0, 1, 2
      long	      twos complement integer	0	64 bits	-2L, -1L, 0L, 1L, 2L
      float	      IEEE 754 floating point	0.0	32 bits	1.23e100f, -1.23e-100f, .3f, 3.14F
      double	   IEEE 754 floating point	0.0	64 bits	1.23456e300d, -1.23456e-300d, 1e1d
      */
      
      //vars
      int age = -1; 
      age = 30;
      age = age + 1;
      
      double weight = 0.0;
      weight = 213.2;
      

      
      boolean isAlive = true;
      
      //isAlive = false;
      isAlive = !isAlive;
      
      //==
      System.out.println("1 - " + isAlive);
      System.out.println("2 - Your age is " + 31 + " your height is " 
            + weight +" and isAlive:" + (isAlive==true));
      
      

   }
}