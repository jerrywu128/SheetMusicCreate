package musicstaffcreate;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pianokeys extends JButton {

        msMidiDevice parent;


        ClassLoader cldr ;
        java.net.URL imageURL;
        public ImageIcon icon ;


        pianokeys(msMidiDevice p){

            super();
            parent = p;
            this.setBackground(Color.white);
            this.setOpaque(true);



            this.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent e){
                    doSomething();
                }

            });

        }

        public void doSomething(){}
    }


