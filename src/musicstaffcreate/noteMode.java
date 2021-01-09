package musicstaffcreate;

import javax.swing.*;

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
        parent.inputtype = inputType.Note;

    }
}
