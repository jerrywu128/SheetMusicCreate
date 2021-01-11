package musicstaffcreate;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class wholenoteButton extends msToggleButton{

    msEditBar parent;
    ImageIcon imageIcon;
    wholenoteButton(msEditBar p) {
        super(p);
        parent =p;
        //this.setBorderPainted(false);
        //this.setBorder(null);
        this.setBounds(0,0,24,24);
        imageURL   = cldr.getResource("icon/whole.png");
        icon = new ImageIcon(imageURL);


        this.setIcon(icon);


        this.setToolTipText("全音符");
    }

    public void doSomething(){
        Toolkit tk = Toolkit.getDefaultToolkit();


        if(parent.inputtype==inputType.Note) {
            imageURL = cldr.getResource("icon/whole-note.png");
            icon = new ImageIcon(imageURL);

            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT));
        }
        else if(parent.inputtype==inputType.rest) {
            imageURL = cldr.getResource("icon/whole-note-rest.png");
            icon = new ImageIcon(imageURL);
            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT));
        }


        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");
        parent.longtype=longType.whole;
        for(int i=0;i<parent.parent.parent.tabbedPane.getTabCount();i++) {
            parent.parent.parent.tabbedPane.getComponentAt(i).setCursor(cu);
        }


    }
}
