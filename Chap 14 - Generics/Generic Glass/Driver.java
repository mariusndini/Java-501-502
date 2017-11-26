public class Driver{
   public static void main(String[] args){
      Glass<AppleJuice> myGlass = new Glass<AppleJuice>();
      myGlass.liquid = new AppleJuice();
      
      // Because the class is generic - but the type is given
      // we do not need to cast here.
      AppleJuice myJuice = myGlass.liquid;
      
      // In generic methods we have to specify which incoming types will be
      // they cannot be mixed and matched. what you specificy is what you put in
      Bartender b = new Bartender();
      b.<AppleJuice, OrangeJuice>mix(myJuice, new OrangeJuice() );
      
   }//end main
}