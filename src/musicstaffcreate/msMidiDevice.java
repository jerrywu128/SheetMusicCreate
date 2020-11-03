package musicstaffcreate;

import java.awt.*;
import javax.swing.*;

public class msMidiDevice extends JLayeredPane {
    MainWin parent;
    pianokeys whitekey[], blackkey[] ;
    int j=275;

    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(0,250));
        whitekey = new pianokeys[14];
        blackkey = new pianokeys[10];
        for(int i =0;i<14;i++) {

            whitekey[i] = new pianokeys(this);
            whitekey[i].setBounds(225+i*68,25,70,220);
            whitekey[i].setOpaque(false);
            this.add(whitekey[i],DEFAULT_LAYER);

            if(i<10) {

                blackkey[i] = new pianokeys(this);

                if((i==2)||(i==5)||(i==7)) j += 70;
                blackkey[i].setBounds(j+i*67  , 25, 40, 180);
                blackkey[i].setBackground(Color.black);
                blackkey[i].setBorderPainted(false);
                this.add(blackkey[i],PALETTE_LAYER);
            }

        }




    }


}
