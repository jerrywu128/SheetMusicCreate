package musicstaffcreate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        System.out.println("clicked!");
        Cursor cu = new Cursor(Cursor.DEFAULT_CURSOR);
        for(int i=0;i<parent.parent.parent.tabbedPane.getTabCount();i++) {
            parent.parent.parent.tabbedPane.getComponentAt(i).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

        parent.inputtype = inputType.Cursor;
        parent.longtype=longType.non;

        parent.parent.editBar.setLengthEnable(false);
    }

}
