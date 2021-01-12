package musicstaffcreate;


import javax.imageio.ImageIO;
import javax.swing.*;

import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.*;






public class saveStaffButton extends msButton{



    JFileChooser fc ;

    saveStaffButton(msToolbar p){

        super(p);

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/floppy.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("儲存檔案");

        fc = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "png jpg document", "png","jpg");
        fc.setFileFilter(filter);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == parent.baseMenu.savefile) {
                 if(parent.parent.tabbedPane.getTabCount()>0) {
                     if (fc.showSaveDialog(parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())) == JFileChooser.APPROVE_OPTION) {
                         File file = fc.getSelectedFile();

                         String fname = fc.getName(file);
                         if(fname.indexOf(".png")==-1){
                             file=new File(fc.getCurrentDirectory(),fname+".png");

                         }

                         BufferedImage image = new BufferedImage(parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getWidth(),
                                 parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getHeight() + ((JScrollPane) parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getVerticalScrollBar().getMaximum() - 300, BufferedImage.TYPE_INT_ARGB);
                         Graphics2D g = image.createGraphics();
                         g.setColor(Color.WHITE);
                         g.fillRect(0, 0, parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getWidth(), parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getHeight() + ((JScrollPane) parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getVerticalScrollBar().getMaximum() - 300);
                         g.setColor(Color.BLACK);
                         (((JScrollPane) parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getViewport().getView()).paint(g);
                         g.dispose();
                         try {
                             ImageIO.write(image, "png",
                                     file);
                             JOptionPane.showMessageDialog(null, "Image saved to "
                                     + fc.getSelectedFile().getName()+".png");
                         } catch (Exception ex) {
                             ex.printStackTrace();
                         }


                     }
                   }
                  }
                }
        });







    }


    public void doSomething(){



    }


}
