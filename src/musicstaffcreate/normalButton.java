package musicstaffcreate;

import javax.swing.*;

public class normalButton extends msToggleButton{

    normalButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/cursor.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("鼠標");
    }

    public void doSomething(){


    }

}
