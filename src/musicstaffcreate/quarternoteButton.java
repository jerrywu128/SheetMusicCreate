package musicstaffcreate;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.ComponentListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class quarternoteButton extends msToggleButton{

    msEditBar parent;
    quarternoteButton(msEditBar p) {
        super(p);
        parent = p;
        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/quarter-note.png");

        icon = new ImageIcon(imageURL);


        this.setIcon(icon);


        this.setToolTipText("四分音符");
    }

    public void doSomething(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        imageURL   = cldr.getResource("icon/quarter-note-up.png");
        icon = new ImageIcon(imageURL);
        ImageIcon imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));

        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");

        parent.parent.parent.tabbedPane.getComponentAt(parent.parent.parent.tabbedPane.getSelectedIndex()).setCursor(cu);





    }

}
