package musicstaffcreate;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class msLabel extends JLabel {

    msStaffPage parent;

    msLabel(String text, int horizontalAlignment,msStaffPage p){
        parent = p;
        this.setText(text);
        this.setHorizontalAlignment(horizontalAlignment);

        this.setVisible(true);

        this.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e){
                Cursor c = new Cursor(Cursor.HAND_CURSOR);
                msLabel.this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                msLabel.this.setCursor(c);
            }
            public void mouseExited(MouseEvent e){

                msLabel.this.setBorder(null);

            }
            public void mouseClicked(MouseEvent e){

                String ren=JOptionPane
                        .showInputDialog("輸入預更改之文字");
                if(ren!=null)
                   msLabel.this.setText(ren);
            }

        });

    }



}
