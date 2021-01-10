package musicstaffcreate;

import javax.swing.*;
import java.awt.*;

public class wholenoteButton extends msToggleButton{

    msEditBar parent;

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

        imageURL   = cldr.getResource("icon/whole-note.png");
        icon = new ImageIcon(imageURL);
        ImageIcon imageIcon = new ImageIcon(icon.getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT));
        Cursor cu = tk.createCustomCursor(imageIcon.getImage(),new Point(16,16),"");
        parent.longtype=longType.whole;
        parent.parent.parent.tabbedPane.getComponentAt(parent.parent.parent.tabbedPane.getSelectedIndex()).setCursor(cu);


    }
}
