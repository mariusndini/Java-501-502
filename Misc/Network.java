import java.io.*;
import java.net.*;

import org.json.JSONObject;

// json Documentation]
// https://www.codevoila.com/post/65/java-json-tutorial-and-example-json-java-orgjson

public class Network {

   public static String getHTML(String urlToRead) throws Exception {
      StringBuilder result = new StringBuilder();
      URL url = new URL(urlToRead);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
         result.append(line);
      }
      rd.close();
      return result.toString();
   }

   public static void main(String[] args) throws Exception{
     System.out.println(getHTML("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1"));
   
      JSONObject ourWeatherData = new JSONObject(getHTML("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1")); 
      System.out.println(ourWeatherData.getInt("visibility"));
   }
}