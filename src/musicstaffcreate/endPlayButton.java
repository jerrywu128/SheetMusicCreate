package musicstaffcreate;

import javax.swing.*;

public class endPlayButton extends  msButton{
    endPlayButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);


        imageURL   = cldr.getResource("icon/stop.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);
        this.setEnabled(false);
        this.setToolTipText("結束");
    }

    public void doSomething(){


    }



}
