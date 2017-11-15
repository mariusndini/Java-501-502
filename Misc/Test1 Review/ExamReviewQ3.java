import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExamReviewQ3{
   public static void main(String[] args){
      Scanner KB = new Scanner(System.in);
      
      System.out.println("How many numbers would you like to enter?");
      int inputNum = KB.nextInt();
             
      int sum = 0;


      try{
         BufferedWriter writer = new BufferedWriter(new FileWriter("numbers.txt"));
         
         for (int i =0; i < inputNum; i++){
            System.out.println("Enter Next Number: ");
            int nextNum = KB.nextInt();
            writer.write(nextNum+"\n");

            sum += nextNum;
            
         }
         double average = sum / inputNum;
         writer.write(average+"");
         
         writer.close();
      }catch(IOException e){
         System.out.println(e);
      }
   
   
   }




}//end exam review 
