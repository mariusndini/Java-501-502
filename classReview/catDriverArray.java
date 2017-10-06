public class catDriverArray{
   public static void main (String[] args){      
      Debug.isOn = true;
      
      cat catList[] = new cat[10];
      cat myCat = new cat(2, "Catty");
      
      System.out.println(cat.allCatslist[0]);
      
      catList[4] = myCat;
      
      catList[0] = new cat(3, "Whiskers");
      catList[0].setAge(catList[0].getAge() + 1);
   
      catList[1] = new cat(5, "cat1");
      catList[2] = new cat(1, "cat2");
      catList[3] = new cat(7, "cat3");
      catList[4] = myCat;
      catList[5] = new cat(2, "cat4");
      catList[6] = new cat(5, "cat5");
      catList[7] = new cat(6, "cat6");
      catList[8] = new cat(2, "cat7");
      catList[9] = new cat(1, "cat8");
      
      
      //for loop to iterate through all of our cats
      for(int i=0; i < catList.length; i=i+1){
         if(catList[i].getAge()> 3){
           System.out.println(i+" - "+catList[i]);
           catList[i].meow();
           
         }//end if
         
      }//end for
      
      System.out.println("\n\n\n");

      cat.getAllCats();
      
   }//end main
}//end catDriver