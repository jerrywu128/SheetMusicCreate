package musicstaffcreate;

import javax.swing.*;

public class halfnoteButton extends msButton{
    halfnoteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/half-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("二分音符");
    }

    public void doSomething(){


    }
}
