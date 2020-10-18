package musicstaffcreate;
//this is main windows
import java.awt.*;
import java.awt.event.*;



public class MainWin extends Frame {

  MSCreate parent;
  Dimension size = new Dimension(600,600);
  public msToolbar toolbar;


  MainWin(MSCreate p){

      parent = p;

      this.setSize(size);
      toolbar = new msToolbar(this);

      this.setLayout(new BorderLayout());
      this.add(toolbar,BorderLayout.NORTH);
      this.setLocation(420,150);

      this.setVisible(true);

      this.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      }



      );



  }




}
