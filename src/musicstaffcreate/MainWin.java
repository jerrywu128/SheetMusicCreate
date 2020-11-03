package musicstaffcreate;
//this is main windows
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MainWin extends Frame {

  MSCreate parent;
  Dimension size = new Dimension(1400,800);

  public msToolbar toolbar;
  public msInstrumentMenu InstrumentMenu;
  public msStaffPage staffPage;
  public msMidiDevice MidiDevice;


  MainWin(MSCreate p){

      parent = p;

      this.setSize(size);
      toolbar = new msToolbar(this);
      InstrumentMenu = new msInstrumentMenu(this);
      staffPage = new msStaffPage(this);
      MidiDevice = new msMidiDevice(this);






      this.setLayout(new BorderLayout());

      this.add(toolbar,BorderLayout.NORTH);
      this.add(InstrumentMenu,BorderLayout.WEST);
      this.add(staffPage,BorderLayout.CENTER);
      this.add(MidiDevice,BorderLayout.SOUTH);




      this.setLocation(240,150);

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
