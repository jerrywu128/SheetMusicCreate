package musicstaffcreate;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.net.URL;

public class msLabel extends JLabel {

    msStaffPage parent;



    msLabel(String text, int horizontalAlignment,msStaffPage p){
        parent = p;
        this.setText(text);
        this.setHorizontalAlignment(horizontalAlignment);

        this.setVisible(true);



        this.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e){

                if(parent.parent.parent.toolbar.editBar.inputtype==inputType.Cursor) {
                    msLabel.this.setEnabled(true);

                    Cursor c = new Cursor(Cursor.HAND_CURSOR);
                    msLabel.this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                    msLabel.this.setCursor(c);
                }else
                    msLabel.this.setEnabled(false);


            }
            public void mouseExited(MouseEvent e){
                if(parent.parent.parent.toolbar.editBar.inputtype==inputType.Cursor) {
                    msLabel.this.setBorder(null);
                }

            }
            public void mouseClicked(MouseEvent e) {
                if (parent.parent.parent.toolbar.editBar.inputtype == inputType.Cursor) {
                    String ren = JOptionPane
                            .showInputDialog("輸入預更改之文字");

                    if (ren != null)
                        msLabel.this.setText(ren);
                }
                }
        });

    }



}
