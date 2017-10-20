import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurButton extends JButton{
   OurButton(String text, int length, int height, int locX, int locY, ActionListener AL){
      super(text);
      super.setSize(length, height);
      super.setLocation(locX, locY);
      
      // Action performed
      ActionListener ourAction = AL;
      super.addActionListener( ourAction);

   }//end our button


}