import javax.swing.JTextField;

public class OurTextField extends JTextField{
   OurTextField(int length, int height, int locX, int locY ){
      super.setSize(length, height);
      super.setLocation(locX, locY);
   }
   
   //Method Overriding
   public String getText(){
      return super.getText().toUpperCase();
   }

}