package musicstaffcreate;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.spi.*;
import javax.swing.*;


public class msInstrumentMenu extends Panel{

    MainWin parent;
    msInstrumentImages instrumentImages;

    msInstrumentMenu(MainWin p){

        parent=p;
        instrumentImages = new msInstrumentImages(this);
        this.setBackground(Color.darkGray);

        this.setLayout(new BorderLayout());
        this.add(instrumentImages,BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(200,0));

    }


}
