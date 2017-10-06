public class arrayDriver{
   public static void main(String[] args){
      //instantiate Array
      int ageList[] = new int[10];  //create a list of ints
      String studentList[] = new String[10]; //create a list of Strings

      ageList[0] = 20;
      studentList[0] = "Tom"; 
      
      ageList[1] = 21;
      studentList[1] = "Lucy"; 
      
      ageList[2] = 23;
      studentList[2] = "Amy"; 
      
      ageList[3] = 25;
      studentList[3] = "Mark"; 
      
      ageList[4] = 21;
      studentList[4] = "Will"; 
      
      ageList[5] = 24;
      studentList[5] = "Angel"; 
      
      ageList[6] = 23;
      studentList[6] = "Angela"; 
      
      ageList[7] = 34;
      studentList[7] = "Hamlet"; 
      
      ageList[8] = 23;
      studentList[8] = "Ori"; 
      
      ageList[9] = 21;
      studentList[9] = "Grace"; 
      
      //getting a specific element out of the array
      int index = 2;
      System.out.println(index + " has a name of " + studentList[index] +
                         " and an age of " + ageList[index]+" \n\n ");
      
      
      //looping through the array
      for(int counter = 0; counter < ageList.length; counter++){
         if(ageList[counter]> 23){
            System.out.println(counter + " has a name of " + studentList[counter] +
                         " and an age of " + ageList[counter]);
         }
      }


      
   }
}