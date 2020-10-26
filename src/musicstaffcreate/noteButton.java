package musicstaffcreate;

import javax.swing.*;

public class noteButton extends msButton{
    noteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/music-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("音符");
    }

    public void doSomething(){


    }
}
