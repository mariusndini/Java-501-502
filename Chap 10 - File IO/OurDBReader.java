//Reader Libs
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class OurDBReader{
   
   FileReader fileToRead;
   private String fileName;
   BufferedReader inputStream;
   
   //construcgor
   OurDBReader(String fileName){
      this.fileName = fileName;
      //reader
      try{
         fileToRead = new FileReader(fileName);
         inputStream = new BufferedReader(fileToRead);
      }
      catch(FileNotFoundException err){
         System.out.println(err);
      }
     
   }

   //Read Method
   public String read(){
      try {
         String line = inputStream.readLine();  
         if(line != null){
            return line;
         }else{
            return "";
         }
         
      }
      catch(FileNotFoundException e){
           System.out.println("File was not found");
           System.out.println("or could not be opened.");
      }catch(IOException e){
           System.out.println("Error reading from file.");
      }//end try catch 
      return ""; //means there is no data to be read
   
   }
   
   public static void main(String[]args) throws FileNotFoundException{
      OurDBReader reader = new OurDBReader("ourTestFile.txt");   
      System.out.println(reader.read()); 
      System.out.println(reader.read());
      System.out.println(reader.read()); 

   }
   
}