public class catDriver{
   public static void main (String[] args){      
      Debug.isOn = false;
      int age = 2;
      String catName = "Catty"; 
      cat myCat = new cat(age, catName);
      //System.out.println(myCat.age);
      int returnValue = myCat.setAge(34);
      //System.out.println(returnValue);
      //myCat == myCat.toString();
      System.out.println(myCat.toString());

      myCat.meow();
      System.out.println(myCat.test());
      
      myCat.purr(7);
      
      
      cat yourCat = new cat(2, "Whiskers");
      //System.out.println(yourCat);
      
      cat clonedCat = new cat(yourCat);
      
      //System.out.println(clonedCat);
      clonedCat.setAge(5);
      clonedCat.setName("otherName");
      
      //System.out.println("My Cat:" + yourCat);
      //System.out.println("Cloned Cat: "+ clonedCat);

      
      
   }//end main
}//end catDriver