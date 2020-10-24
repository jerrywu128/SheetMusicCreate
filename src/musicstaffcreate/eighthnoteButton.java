package musicstaffcreate;

import javax.swing.*;

public class eighthnoteButton extends msButton{
    eighthnoteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);


        imageURL   = cldr.getResource("icon/eighth-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("八分音符");
    }

    public void doSomething(){


    }



}
