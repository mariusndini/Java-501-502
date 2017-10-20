import javax.swing.JLabel;
import java.awt.Font;

//To Redraw
import javax.swing.JFrame;

public class OurLabel extends JLabel{
   int size = 0;
   JFrame frame;
   Font newLabelFont;
   
   OurLabel(String text, int height, int length, int locX, int locY, int size ){
      super(text);
      super.setSize(length, height);
      super.setLocation(locX, locY);
      this.size = size;
      
      
      newLabelFont = new Font(super.getFont().getName(), 
                              super.getFont().getStyle(), size);

      //Set JLabel font using new created font
      super.setFont(newLabelFont);   
      
   }

   public void setFrame(JFrame frame){
      this.frame = frame;
   }
   
   public void setFont(int font){
      System.out.println("Resizing");
      newLabelFont = new Font(super.getFont().getName(), 
                              super.getFont().getStyle(), font);
      super.setFont(newLabelFont);
      frame.revalidate();
      frame.repaint(); //redraws the canvas
   }


}