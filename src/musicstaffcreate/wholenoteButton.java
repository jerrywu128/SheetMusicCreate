package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class wholenoteButton extends msButton{

    wholenoteButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);
        this.setBounds(0,0,24,24);
        imageURL   = cldr.getResource("icon/whole.png");
        icon = new ImageIcon(imageURL);


        this.setIcon(icon);


        this.setToolTipText("全音符");
    }

    public void doSomething(){


    }
}
