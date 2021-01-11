package musicstaffcreate;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class openfileButton extends msButton{

     JFileChooser fc = new JFileChooser();

    openfileButton(msToolbar p) {
        super(p);
        //this.setBorderPainted(false);
        //this.setBorder(null);




        imageURL   = cldr.getResource("icon/folder.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);
        this.setToolTipText("開啟檔案");



        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        fc.setFileFilter(filter);


        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == parent.baseMenu.openfile) {

                    int returnVal = fc.showOpenDialog(parent);
                    if(returnVal == JFileChooser.APPROVE_OPTION) {
                        System.out.println("You chose to open this file: " +
                                fc.getSelectedFile().getName());
                    }
                }
            }
        });




    }



}
