package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class halfnoteButton extends msToggleButton{
    msEditBar parent;
    halfnoteButton(msEditBar p) {

        super(p);
        parent=p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/half-note.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);


        this.setToolTipText("二分音符");
    }

    public void doSomething(){
        Toolkit tk = Toolkit.getDefaultToolkit();

        imageURL   = cldr.getResource("icon/half-note-up.png");
        icon = new ImageIcon(imageURL);
        ImageIcon imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));

        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");
        parent.longtype=longType.half;
        parent.parent.parent.tabbedPane.getComponentAt(parent.parent.parent.tabbedPane.getSelectedIndex()).setCursor(cu);


    }
}
