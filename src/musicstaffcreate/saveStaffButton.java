package musicstaffcreate;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class saveStaffButton extends msButton{



    JFileChooser fc ;;
    saveStaffButton(msToolbar p){

        super(p);

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/floppy.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("儲存檔案");

        fc = new JFileChooser();

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == parent.baseMenu.savefile) {
                    int returnVal = fc.showSaveDialog(saveStaffButton.this);
                }
            }
        });






    }

    public void doSomething(){



    }


}
