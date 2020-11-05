package musicstaffcreate;
//This is a StaffPage you can edit note in this panel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;



public class msStaffPage extends Panel{

    msTabbedPane parent;



    msStaffPage(msTabbedPane p){
        parent = p;

        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(0,0));


        this.parent.setVisible(true);


    }

    public void paint(Graphics g){

        g.setColor(Color.black);

        g.drawLine(100,195,400,195);
        g.drawLine(100,175,400,175);
        g.drawLine(100,185,400,185);
        g.drawLine(100,165,400,165);
        g.drawLine(100,155,400,155);
        g.setFont(new Font("",0,80));
        g.drawString("\uD834\uDD1E",110,202);

        g.setFont(new Font("標楷體",0,30));
        g.drawString("軟體開發中",170,183);


    }


}


