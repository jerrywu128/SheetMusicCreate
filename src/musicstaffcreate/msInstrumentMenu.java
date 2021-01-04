package musicstaffcreate;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.spi.*;
import javax.swing.*;


public class msInstrumentMenu extends Panel{

    MainWin parent;
    msInstrumentImages instrumentImages;
    msInstrumentList instrumentList;

    msInstrumentMenu(MainWin p){

        parent=p;
        instrumentList = new msInstrumentList(this);
        instrumentImages = new msInstrumentImages(this);

        this.setBackground(Color.darkGray);

        this.setLayout(new BorderLayout());
        this.add(instrumentList,BorderLayout.SOUTH);
        this.add(instrumentImages,BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(200,0));


    }


}
