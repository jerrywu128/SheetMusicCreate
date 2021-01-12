package musicstaffcreate;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.IOException;

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
                "JPG & PNG Images", "jpg", "png");
        fc.setFileFilter(filter);


        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == parent.baseMenu.openfile) {


                    int returnVal = fc.showOpenDialog(parent);
                    if(returnVal == JFileChooser.APPROVE_OPTION) {
                        System.out.println("You chose to open this file: " +
                                fc.getSelectedFile().getName());
                        try {
                            File file = fc.getSelectedFile();
                            BufferedImage image = ImageIO.read(file);

                            JLabel nlabel= new JLabel(new ImageIcon(image));
                            nlabel.setVisible(true);
                            JScrollPane npanel=new JScrollPane(nlabel);
                            npanel.getVerticalScrollBar().setUnitIncrement(10);

                            npanel.setVisible(true);
                            parent.parent.tabbedPane.addTab("page",npanel);

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                    }
                }
            }
        });




    }



}
