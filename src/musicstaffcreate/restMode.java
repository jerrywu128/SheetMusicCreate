package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class restMode extends msToggleButton{
    msEditBar parent;

    restMode(msEditBar p) {
        super(p);
        parent = p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/quarter-note-rest.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("休止符");
    }

    public void doSomething(){

        parent.parent.editBar.setLengthEnable(true);
        parent.inputtype = inputType.rest;


    }
}
