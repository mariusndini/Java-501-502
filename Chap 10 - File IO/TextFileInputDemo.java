import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextFileInputDemo{
    public static void main(String[] args){
       try{
           FileReader fileToRead = new FileReader("output.txt");
           BufferedReader inputStream = new BufferedReader(fileToRead);

           // Read first line (If there)
           String line = inputStream.readLine( );
           System.out.println(line);
        
           //read next line (if there)         
           line = inputStream.readLine( );
           System.out.println(line); 
           inputStream.close( );
       }// End Try
       catch(FileNotFoundException e){
           System.out.println("File was not found");
           System.out.println("or could not be opened.");
       }
       catch(IOException e){
           System.out.println("Error reading from file.");
       }//end try catch
       
       
       
       
       
       
    }
}

