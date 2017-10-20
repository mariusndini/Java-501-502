/*
   Importing all of the compnonents we are going to be using
   JAVA UIs are Chapter 17 and 18

*/


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;// for Buttons
import java.awt.event.ActionListener; //for Buttons

class OurFrame extends JFrame{
   //Glbal Vars (only for this though)
   JPanel panel = new JPanel();
   int width;
   int height;

   //Constructor
   OurFrame(){
        //A Lot of default contructor have logic in them
        super();
   } //Default Constructor
   
   //Constructor for our window frame
   OurFrame(String name, int width, int height){
      super(name); //constructor
      super.setSize(width, height);
      
      this.width = width;
      this.height = height;
      
      panel.setLayout(null); // Java will give us a Default layout to place objects, we want to override this
                             // We want our objects to be shown where we place them      
                                   
      super.add(panel);
      setUpEverything();
      draw();
   }
   
   public void draw(){
      super.setVisible(true);      
   }
   
   //MAKES all of our buttons, labels etc.
   public void setUpEverything(){
      OurLabel lbl = new OurLabel("Welcome to my survey", 40, this.width, 50, 0, 20); 
                                 //String text, int height, int length, int locX, int locY, int size
      lbl.setFrame(this);
      panel.add(lbl);
      
      OurTextField TF1 = new OurTextField((int)(this.width * .25), 20, (int)(this.width * .75), 50);      
      panel.add(new OurLabel("What do you think about product 1", 20, (int)(this.width * .75), 10, 50, 13));
                //int length, int height, int locX, int locY
      panel.add(TF1);
     
      panel.add(new OurLabel("What do you think about product 2", 20, (int)(this.width * .75), 10, 100, 13));
      panel.add(new OurTextField((int)(this.width * .25), 20, (int)(this.width * .75), 100));
      
      panel.add(new OurLabel("What do you think about product 3", 20, (int)(this.width * .75), 10, 150, 13));
      panel.add(new OurTextField((int)(this.width * .25), 20, (int)(this.width * .75), 150));
      
      panel.add(new OurLabel("What do you think about product 4", 20, (int)(this.width * .75), 10, 200, 13));
      panel.add(new OurTextField((int)(this.width * .25), 20, (int)(this.width * .75), 200));
     
     
     ActionListener ourAction = new ActionListener(){
          // This is an Inner Class  - Chapter 13
          public void actionPerformed(ActionEvent e){
              lbl.setFont(30);
              System.out.println(TF1.getText());
              
         }
      };
      
      //String text, int length, int height, int locX, int locY
      panel.add(new OurButton("Submit", 200, 30, 10, 220, ourAction));


   }

  


}//end JFrame

class OurFrameDriver{
   public static void main(String[] args){
      OurFrame window = new OurFrame("My Survey", 400, 600);

   }
   
}//end driver



