package musicstaffcreate;
//this is main windows
import org.jfugue.player.Player;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.Vector;



public class MainWin extends JFrame {

  MSCreate parent;
  Dimension size = new Dimension(1400,800);



  public msToolbar toolbar;
  public msInstrumentMenu InstrumentMenu;

  public msTabbedPane tabbedPane;
  public msMidiDevice MidiDevice;




  MainWin(MSCreate p){

      parent = p;

      this.setSize(size);
      toolbar = new msToolbar(this);
      InstrumentMenu = new msInstrumentMenu(this);

      tabbedPane = new msTabbedPane(this);

      MidiDevice = new msMidiDevice(this);


      this.setLayout(new BorderLayout());

      this.add(toolbar,BorderLayout.NORTH);
      this.add(InstrumentMenu,BorderLayout.WEST);
      this.add(tabbedPane,BorderLayout.CENTER);
      this.add(MidiDevice,BorderLayout.SOUTH);




      this.setLocation(25,50);



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
