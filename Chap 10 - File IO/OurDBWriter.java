//Writer Libs
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class OurDBWriter{
   //Writer Objects   
   PrintWriter outputStream = null;
   private String fileName;
   
   //constructor 
   OurDBWriter(String fileName){
      this.fileName = fileName;
      try{
         //writer
         FileOutputStream ourFile = new FileOutputStream(fileName, true); //this is where the exception could occur 
         outputStream = new PrintWriter(ourFile);//we are going to be writing to this file.
      
      }catch(FileNotFoundException err){
         System.out.println(err);
      }
   }
   
   public void write(String line){
      outputStream.println(line);
   }
   
   public void close(){
      outputStream.close( );
   }
   
   public static void main(String[]args) throws FileNotFoundException{
      OurDBWriter writer = new OurDBWriter("ourTestFile.txt");   
      writer.write("test1 proving that it works");
      writer.write("test2 proving that it works");
      writer.write("test3 proving that it works");
      writer.close();
   }

}