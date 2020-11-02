package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msMidiDevice extends JLayeredPane {
    MainWin parent;
    JButton  b[],bb[] ;
    int j=145;

    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(0,250));
        b = new JButton[14];
        bb = new JButton[10];
        for(int i =0;i<14;i++) {

            b[i] = new JButton();

            b[i].setBounds(95+i*68,30,70,220);
            //b[i].setBackground(Color.white);
            //b[i].setOpaque(true);
            this.add(b[i],DEFAULT_LAYER);

            if(i<10) {

                bb[i] = new JButton();

                if((i==2)||(i==5)||(i==7)) j += 70;
                bb[i].setBounds(j+i*67  , 30, 40, 180);
                bb[i].setBackground(Color.black);
                bb[i].setOpaque(true);
                bb[i].setBorderPainted(false);

                this.add(bb[i],PALETTE_LAYER);
            }

        }




    }


}
