package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msMidiDevice extends Panel {
    MainWin parent;

    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(0,250));

    }


}
