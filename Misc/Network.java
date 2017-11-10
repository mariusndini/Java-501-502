import java.io.*;
import java.net.*;

import org.json.JSONObject;

// json Documentation
// https://www.codevoila.com/post/65/java-json-tutorial-and-example-json-java-orgjson

public class Network {
   //Instance Vars
   JSONObject jsonObject; 
   private String zipCode;
   private String zipCodes[] = new String[5]; //hard coded value - Not Good
   
   // Constructor
   public Network(String zipCode){
      this.zipCode = zipCode;
      String json = getWeatherData(zipCode);
      try{
         jsonObject = new JSONObject(json);
      }catch(Exception e){
         System.out.println(e);
      }
   }//end netjwork constructor
   
   // Get call to get Information for us
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
   
   private String getWeatherData(String zipCode){
      String answer ="";
      try{
         answer = getHTML("http://api.openweathermap.org/data/2.5/weather?zip="+zipCode+",us&appid=e72cccec9a31348264aba9aa250d616d");
      }catch(Exception e){
         System.out.println(e);
      }
      return answer;
   }
   
// getTemp instance method
   public double getTemp()throws Exception{
      double temp = jsonObject.getJSONObject("main").getDouble("temp");
      return temp;
   }

   public double getLong()throws Exception{
      double temp = jsonObject.getJSONObject("coord").getDouble("lon");
      return temp;
   }
   
   public double getLat()throws Exception{
      double temp = jsonObject.getJSONObject("coord").getDouble("lat");
      return temp;
   }


//end getters


   private void importData(){
      try {
          BufferedReader br = new BufferedReader(new FileReader("zipCodes.txt"));
          String line = "";
          
          int counter = 0;
          while (line != null && counter < 5){ //loop goes around an extra time
            line = br.readLine();
            zipCodes[counter] = line;
            counter ++;   
          }
          br.close();

      }catch (Exception e){
         System.out.println("File Reading Error" + e);
      }
   } 

   public void getData() throws Exception{
      importData();
      try{      
         BufferedWriter writer = new BufferedWriter(new FileWriter("OurWeatherDataFile.txt"));
         writer.write(getWeatherData(zipCodes[0])+"\n");
         writer.write(getWeatherData(zipCodes[1])+"\n");
         writer.write(getWeatherData(zipCodes[2])+"\n");
         writer.write(getWeatherData(zipCodes[3])+"\n");
         writer.write(getWeatherData(zipCodes[4]));
           
         writer.close();
         
      }catch(Exception e){
         System.out.println(e);
      }
   }

   public static void main(String[] args) throws Exception{   
      Network ourData = new Network("19181");      
      System.out.println(ourData.getTemp());
      System.out.println(ourData.getLong());
      System.out.println(ourData.getLat());

      //ourData.getData();
      //System.out.println(ourWeatherData.getInt("visibility"));

      
      
   }
}