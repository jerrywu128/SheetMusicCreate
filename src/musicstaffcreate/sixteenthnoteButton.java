package musicstaffcreate;

import javax.swing.*;

public class sixteenthnoteButton extends msButton{

    sixteenthnoteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/sixteenth-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("十六分音符");
    }

    public void doSomething(){


    }
}
