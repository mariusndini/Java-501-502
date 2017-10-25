

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TextFileOutputDemo
{
    public static void main(String[] args)
    {
        PrintWriter outputStream = null;
        FileOutputStream = new FileOutputStream("stuff.txt");  
        try
        {
            outputStream = new PrintWriter();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file stuff.txt.");
            System.exit(0);
        }

        System.out.println("Writing to file.");

        outputStream.println("The quick brown fox");
        outputStream.println("jumped over the lazy dog.");

        outputStream.close( );

        System.out.println("End of program.");
    }
}
