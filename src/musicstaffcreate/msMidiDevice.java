package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;

public class msMidiDevice extends Panel {
    MainWin parent;

    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.cyan);
        this.setPreferredSize(new Dimension(0,250));

    }


}
