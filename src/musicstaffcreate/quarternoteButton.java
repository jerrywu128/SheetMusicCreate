package musicstaffcreate;

import javax.swing.*;

public class quarternoteButton extends msButton{

    quarternoteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/quarter-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("四分音符");
    }

    public void doSomething(){


    }

}
