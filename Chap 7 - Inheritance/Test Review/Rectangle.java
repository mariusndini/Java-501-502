public class Rectangle{
   int length;
   int width;
   
   Rectangle(int length, int width){
      this.length = length;
      this.width = width;
   }    
   
   //getters
   public int getLength(){
      return length;
   }
   
    public int getWidth(){
      return width;
   }
   
   //Setters
   public void setLength(int length){
      this.length = length;
   }
   
    public void setWidth(int width){
      this.width = width;
   }
   
   public int area(){
      return length * width;
   }
   
   public static int totalArea(Rectangle rect[]){
      int sum = 0;
      for(int i = 0; i < rect.length; i++){
         sum = sum + rect[i].area();
      }//end for
   
      return sum;
   }
   
   public Rectangle merge(Rectangle rect){
      int l = length + rect.getLength();
      int w = getWidth() + rect.getWidth();
      
      Rectangle ourNewRect = new Rectangle(l, w);
      return ourNewRect;
   }

   public String toString(){
      return "Length: "+length+", width: "+width;
   }
   
}//end class