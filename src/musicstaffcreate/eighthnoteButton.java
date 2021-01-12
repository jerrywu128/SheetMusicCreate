package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class eighthnoteButton extends msToggleButton{

    msEditBar parent;
    ImageIcon imageIcon;
    eighthnoteButton(msEditBar p) {

        super(p);
        parent =  p;
        //this.setBorderPainted(false);
        //this.setBorder(null);


        imageURL   = cldr.getResource("icon/eighth-note-up.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("八分音符");
    }

    public void doSomething(){
        Toolkit tk = Toolkit.getDefaultToolkit();

        if(parent.inputtype==inputType.Note) {
            imageURL = cldr.getResource("icon/eighth-note-up.png");
            icon = new ImageIcon(imageURL);
            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
        }
        else if(parent.inputtype==inputType.rest) {
            imageURL = cldr.getResource("icon/eighth-note-rest.png");
            icon = new ImageIcon(imageURL);
            imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 35, Image.SCALE_DEFAULT));
        }


        parent.longtype=longType.eighth;
        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");

        for(int i=0;i<parent.parent.parent.tabbedPane.getTabCount();i++) {
            parent.parent.parent.tabbedPane.getComponentAt(i).setCursor(cu);
        }


    }



}
