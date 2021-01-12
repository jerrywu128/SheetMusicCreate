package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class sixteenthnoteButton extends msToggleButton{

    msEditBar parent;
    ImageIcon imageIcon;
    sixteenthnoteButton(msEditBar p) {
        super(p);
        parent=p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/sixteenth-note-up.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("十六分音符");
    }

    public void doSomething(){
        Toolkit tk = Toolkit.getDefaultToolkit();


        if(parent.inputtype==inputType.Note) {
            imageURL = cldr.getResource("icon/sixteenth-note-up.png");
            icon = new ImageIcon(imageURL);
            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
        }
        else if(parent.inputtype==inputType.rest) {
            imageURL = cldr.getResource("icon/sixteenth-note-rest.png");
            icon = new ImageIcon(imageURL);
            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(32, 35, Image.SCALE_DEFAULT));
        }

        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");
        parent.longtype=longType.sixteenth;
        for(int i=0;i<parent.parent.parent.tabbedPane.getTabCount();i++) {
            parent.parent.parent.tabbedPane.getComponentAt(i).setCursor(cu);
        }


    }
}
