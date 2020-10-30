package musicstaffcreate;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msStaffPage extends Panel{

    MainWin parent;

    msStaffPage(MainWin p){
        parent = p;
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(0,0));



    }

    public void paint(Graphics g){

        g.setColor(Color.black);

        g.drawLine(100,295,400,295);
        g.drawLine(100,275,400,275);
        g.drawLine(100,285,400,285);
        g.drawLine(100,265,400,265);
        g.drawLine(100,255,400,255);
        g.setFont(new Font("Arial",0,80));
        g.drawString("\uD834\uDD1E",110,302);
        g.setFont(new Font("Arial",0,30));
        g.drawString("軟體開發中",170,283);


    }


}
