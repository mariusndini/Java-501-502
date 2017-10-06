public class Debug{   
   public static boolean isOn = true;
   public static String identifier = "*";
  
   //static methods - belong to every object of Debug
   public static void print(String comment){
      if(isOn){
         System.out.println(identifier+ comment +" "+identifier);
      }
   }

}//end debug class