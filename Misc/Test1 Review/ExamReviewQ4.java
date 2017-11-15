import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ExamReviewQ4{
   public static void main(String[] args){
   
      try{
         //for writing
         BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
         //for reading
         BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
         
         String line;         
         while ((line = reader.readLine()) != null) {
            writer.write(line+"\n");
         }

         writer.close();
         
         
      }catch(FileNotFoundException e){
         System.out.println(e);
      }catch(IOException e){
         System.out.println(e);
      }
   
   
   }




}//end exam review 
