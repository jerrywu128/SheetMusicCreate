package musicstaffcreate;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msEditBar extends Panel {
    msToolbar parent;
    msEditBar(msToolbar p){

        parent = p;
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(0,40));
        this.setLayout(new BoxLayout(msEditBar.this,BoxLayout.X_AXIS));


    }


}
