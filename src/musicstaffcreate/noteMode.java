package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class noteMode extends msToggleButton{
    msEditBar parent;

    noteMode(msEditBar p) {
        super(p);
        parent = p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/music-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("音符");



    }

    public void doSomething(){
        parent.parent.editBar.setLengthEnable(true);
        if(parent.inputtype != inputType.Note) {
            parent.resetlongButtongroup();
            parent.longtype=longType.non;
            for(int i=0;i<parent.parent.parent.tabbedPane.getTabCount();i++) {
                parent.parent.parent.tabbedPane.getComponentAt(i).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        }

        parent.inputtype = inputType.Note;



    }
}
