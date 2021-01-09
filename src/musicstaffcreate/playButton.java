package musicstaffcreate;

import javax.swing.*;

public class playButton extends msButton{

        playButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);


        imageURL   = cldr.getResource("icon/play.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);
        this.setEnabled(false);
        this.setToolTipText("播放");
    }

    public void doSomething(){


    }


}
