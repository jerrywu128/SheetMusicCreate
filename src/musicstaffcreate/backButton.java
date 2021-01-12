package musicstaffcreate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class backButton extends JButton{

    msStaffPage parent;

    ClassLoader cldr ;
    URL imageURL;
    public ImageIcon icon ;

    backButton(msStaffPage p){

        this.setFocusable(false);
        parent =p;

        //隱藏按鈕外誆

        this.setBorderPainted(false);
        this.setBorder(null);
        cldr = this.getClass().getClassLoader();
        imageURL   = cldr.getResource("icon/reply-message.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("返回上一步");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doSomething();
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(parent.notes.size()!=0)
                    backButton.this.setVisible(true);
            }
        });

    }
    public void doSomething(){


        if((parent.parent.parent.toolbar.editBar.inputtype==inputType.Cursor)){
           if(parent.notes.size()>0) {
             parent.forward.setVisible(true);
             parent.panel.remove(parent.notes.lastElement());
             parent.trash_notes.add(parent.notes.lastElement());
             parent.notes.remove(parent.notes.lastElement());
             parent.panel.repaint();
             if(parent.notes.size()==0)
                 this.setVisible(false);
         }
        }
    }

}
