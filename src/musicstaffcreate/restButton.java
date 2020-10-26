package musicstaffcreate;

import javax.swing.*;

public class restButton extends msButton{
    restButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/quarter-note-rest.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("休止符");
    }

    public void doSomething(){


    }
}
