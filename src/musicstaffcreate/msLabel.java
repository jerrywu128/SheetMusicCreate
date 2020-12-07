package musicstaffcreate;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class msLabel extends JLabel {

    msLabel(String text, int horizontalAlignment){
        this.setText(text);
        this.setHorizontalAlignment(horizontalAlignment);
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setVisible(true);

        this.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e){
                Cursor c = new Cursor(Cursor.HAND_CURSOR);
                msLabel.this.setCursor(c);
            }
            public void mouseClicked(MouseEvent e){
                msLabel.this.setText("test");
            }

        });

    }



}
