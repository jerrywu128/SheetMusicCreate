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
                "PDF DOCUMENT", "jpg");
        fc.setFileFilter(filter);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == parent.baseMenu.savefile) {

                    if (fc.showSaveDialog(parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())) == JFileChooser.APPROVE_OPTION) {
                        File file = fc.getSelectedFile();
                        BufferedImage image = new BufferedImage(parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getWidth(),
                                parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getHeight()+((JScrollPane)parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getVerticalScrollBar().getMaximum(), BufferedImage.TYPE_INT_ARGB);
                        Graphics2D g = image.createGraphics();
                        g.setColor(Color.WHITE);
                        g.fillRect(0,0,parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getWidth(),parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getHeight()+((JScrollPane)parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getVerticalScrollBar().getMaximum());//填充整个屏幕
                        g.setColor(Color.BLACK);
                        (((JScrollPane) parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getViewport().getView()).paint(g);
                        g.dispose();
                        try {
                            ImageIO.write(image, "png",
                                    fc.getSelectedFile());
                            JOptionPane.showMessageDialog(null, "Image saved to "
                                    + fc.getSelectedFile().getName());
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        //Document doc = new Document(new PdfDocument(new PdfWriter("/path/to/output.pdf")));
                  /*      try {




                            BufferedImage image = new BufferedImage(parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getWidth(),
                                    parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex()).getHeight()+((JScrollPane)parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).getVerticalScrollBar().getMaximum(), BufferedImage.TYPE_INT_ARGB);
                            Graphics2D g2 = image.createGraphics();
                            ((JScrollPane)parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).paint(g2);
                            g2.dispose();
                            ((JScrollPane)parent.parent.tabbedPane.getComponentAt(parent.parent.tabbedPane.getSelectedIndex())).printAll(g2);
                            g2.dispose();


                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        finally{

                                doc.close();
                        }



                    }*/


                    }
                  }
                }
        });







    }


    public void doSomething(){



    }


}
