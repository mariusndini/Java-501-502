import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.DatatypeConverter;

public class sha256{
   public static String getHash(String myHash){
      try{
         MessageDigest digest = MessageDigest.getInstance("SHA-256");
         byte[] hash = digest.digest(myHash.getBytes(StandardCharsets.US_ASCII));   
         return DatatypeConverter.printHexBinary(hash);
         
               
      }catch(Exception e){
         System.out.println(e);
      }
      return "";
   }

   //driver for above method
   public static void main(String[] args){
      System.out.println(sha256.getHash("test"));
      System.out.println(sha256.getHash("test"));
      System.out.println(sha256.getHash("Test"));
      
   }

}