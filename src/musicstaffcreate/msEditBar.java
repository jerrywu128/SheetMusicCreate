package musicstaffcreate;


import java.awt.*;
import java.awt.event.*;

public class msEditBar extends Panel {
    msToolbar parent;
    msEditBar(msToolbar p){

        parent = p;
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(0,40));


    }


}
