package musicstaffcreate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class forwardButton extends JButton{

    ClassLoader cldr ;
    URL imageURL;
    public ImageIcon icon ;
    msStaffPage parent;

    forwardButton(msStaffPage p){

        parent = p;

        //隱藏按鈕外誆

        this.setBorderPainted(false);
        this.setBorder(null);

        cldr = this.getClass().getClassLoader();
        imageURL   = cldr.getResource("icon/arrow.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("返回復原前");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doSomething();
            }
        });


    }
    public void doSomething(){
        if((parent.parent.parent.toolbar.editBar.inputtype==inputType.Cursor)){
            if(parent.trash_notes.size()>0) {
                parent.back.setVisible(true);
                parent.notes.add(parent.trash_notes.lastElement());
                parent.panel.add(parent.trash_notes.lastElement());
                parent.trash_notes.remove(parent.trash_notes.lastElement());
                parent.panel.repaint();
                if(parent.trash_notes.size()==0)
                    this.setVisible(false);
            }
        }

    }

}
