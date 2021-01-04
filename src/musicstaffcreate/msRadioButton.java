package musicstaffcreate;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class msRadioButton extends JRadioButton {

    msInstrumentList parent;

    msRadioButton(msInstrumentList p,String text,boolean selected,int i){

        parent = p;
        this.setText(text);
        this.setSelected(selected);

        this.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){

                parent.parent.instrumentImages.Images.setToolTipText(parent.Instrument_name[i]);

                parent.parent.instrumentImages.imageURL   = parent.parent.instrumentImages.cldr.getResource("icon/"+parent.Instrument_imageId[i]+".png");
                parent.parent.instrumentImages.icon = new ImageIcon(parent.parent.instrumentImages.imageURL);
                parent.parent.instrumentImages.Images.setIcon(parent.parent.instrumentImages.icon);

            }

        });


    }


}
