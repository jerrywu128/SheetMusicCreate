package musicstaffcreate;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.spi.*;
import javax.swing.*;


public class msInstrumentMenu extends Panel{

    MainWin parent;

    msInstrumentMenu(MainWin p){

        parent=p;
        this.setBackground(Color.darkGray);
        this.setPreferredSize(new Dimension(200,0));



    }


}
