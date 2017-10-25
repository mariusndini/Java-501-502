
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TextFileOutputDemo{
    public static void main(String[] args){
        PrintWriter outputStream = null;
        try{
            FileOutputStream ourFile = new FileOutputStream("output.txt"); //this is where the exception could occur 
            outputStream = new PrintWriter(ourFile);//we are going to be writing to this file.
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file stuff.txt.");
            System.exit(0);
        }

        System.out.println("Writing to file.");

        outputStream.println("<h1 style='background-color:blue'>This is HTML code</h1>");
        outputStream.println("jumped over the lazy dog.");

        outputStream.close( ); // This is when everything is saved.

        System.out.println("End of program.");
        
        
        
    }
}
