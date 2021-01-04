package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class msInstrumentList extends JPanel {

    msInstrumentMenu parent;
    JRadioButton Instrument[];
    ButtonGroup Instrument_list;

    String Instrument_name []={("鋼琴"),("單簧管"),("長笛"),("薩克斯風"),("法國號"),("小號"),("長號"),("上低音號"),("低音號")};

    msInstrumentList(msInstrumentMenu p){

        parent = p;

        this.setBackground(Color.darkGray);
        this.setPreferredSize(new Dimension(0,347));

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        Instrument_list =new ButtonGroup();

        Instrument = new JRadioButton[9];

        for(int i=0;i<9;i++) {
            if(i==0)
                Instrument[i] = new JRadioButton(Instrument_name[i],true);
            else
                Instrument[i] = new JRadioButton(Instrument_name[i],false);

            Instrument[i].setForeground(Color.white);
            Instrument[i].setOpaque(false);



            Instrument_list.add(Instrument[i]);

            this.add(Instrument[i]);
            this.add(new JLabel(" "));
        }





    }

}
