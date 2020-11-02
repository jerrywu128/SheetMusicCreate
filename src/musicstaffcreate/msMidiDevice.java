package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msMidiDevice extends JLayeredPane {
    MainWin parent;
    JButton  b[],bb ;


    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(0,250));
        b = new JButton[15];

        for(int i =0;i<15;i++) {

            b[i] = new JButton();

            b[i].setBounds(95+i*68,30,70,220);
            b[i].setBackground(Color.black);
            b[i].setOpaque(true);
            this.add(b[i],DEFAULT_LAYER);

            if(i==1) {
                bb = new JButton();

                bb.setBounds(140  , 30, 50, 180);
                bb.setBackground(Color.black);
                bb.setOpaque(true);
                bb.setBorderPainted(false);

                this.add(bb,PALETTE_LAYER);
            }

        }




    }


}
