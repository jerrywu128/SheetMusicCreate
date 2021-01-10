package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class cursorMode extends msToggleButton{
    msEditBar parent;
    cursorMode(msEditBar p) {
        super(p);
        parent=p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/cursor.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setSelected(true);
        this.setToolTipText("鼠標");




    }

    public void doSomething(){

        Cursor cu = new Cursor(Cursor.DEFAULT_CURSOR);
        if(parent.parent.parent.tabbedPane.getTabCount()>0) {
            parent.parent.parent.tabbedPane.getComponentAt(parent.parent.parent.tabbedPane.getSelectedIndex()).setCursor(cu);
        }
        parent.inputtype = inputType.Cursor;
        parent.longtype=longType.non;

        parent.parent.editBar.setLengthEnable(false);
    }

}
