package musicstaffcreate;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class msInstrumentImages extends JPanel {
    msInstrumentMenu parent;
    JLabel Images;

    ClassLoader cldr ;
    java.net.URL imageURL;
    ImageIcon icon ;

    msInstrumentImages(msInstrumentMenu p){

        super();
        parent = p;

        Images = new JLabel();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        cldr = this.getClass().getClassLoader();
        imageURL   = cldr.getResource("icon/"+parent.instrumentList.Instrument_imageId[0]+".png");
        icon = new ImageIcon(imageURL);
        this.Images.setIcon(icon);
        Images.setToolTipText("鋼琴");

        this.setBackground(Color.gray);
        this.setPreferredSize(new Dimension(0,75));
        this.add(Images);


    }
}
