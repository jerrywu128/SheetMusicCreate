package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class msInstrumentList extends JPanel {

    msInstrumentMenu parent;
    msRadioButton Instrument[];
    ButtonGroup Instrument_list;

    int i;

    String Instrument_name []={("鋼琴"),("單簧管"),("長笛"),("薩克斯風"),("法國號"),("小號"),("長號"),("上低音號"),("低音號")};
    String Instrument_imageId [] ={("piano1"),("clarinet"),("flute"),("saxophone"),("french-horn"),("trumpet"),("trombone"),("bariton"),("tuba")};
    msInstrumentList(msInstrumentMenu p){

        parent = p;

        this.setBackground(Color.darkGray);
        this.setPreferredSize(new Dimension(0,347));

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        Instrument_list =new ButtonGroup();

        Instrument = new msRadioButton[9];

        for(i=0;i<9;i++) {
            if(i==0)
                Instrument[i] = new msRadioButton(this,Instrument_name[i],true,i);
            else
                Instrument[i] = new msRadioButton(this,Instrument_name[i],false,i);

            Instrument[i].setForeground(Color.white);
            Instrument[i].setOpaque(false);



            Instrument_list.add(Instrument[i]);

            this.add(Instrument[i]);
            this.add(new JLabel(" "));
        }





    }

}
