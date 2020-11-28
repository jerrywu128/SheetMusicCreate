package musicstaffcreate;
//This is a StaffPage you can edit note in this panel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;



public class msStaffPage extends JScrollPane{

    msTabbedPane parent;
    static int count=0;
    int id;

    JPanel  panel;

    msStaffPage(msTabbedPane p){
        parent = p;
        count++;
        id=count;
        panel = new JPanel(){

            public void paint(Graphics g){

                int l=0;
                int x[]={370,600,830,1050};//分隔線位置

                g.setColor(Color.black);

                for(int i=0;i<10;i++) {
                    for(int j=0;j<5;j++) {
                        g.drawLine(100, 155+ j*10 + l, 1050, 155 + j*10 + l);
                    }//五線
                    g.setFont(new Font("", 0, 90));
                    g.drawString("\uD834\uDD1E", 110, 202+l);
                    for(int k=0;k<4;k++) {
                        g.setFont(new Font("", Font.BOLD, 80));
                        g.drawLine(x[k], 195 + l, x[k], 155 + l);
                     }//小節數
                    l+=125;
                }

                g.setFont(new Font("標楷體",0,30));
                g.drawString("軟體開發中",500,83);

                g.setFont(new Font("標楷體",0,17));
                g.drawString("author",1000,133);

                g.drawString("-" + id + "-", 550, 1390);
            }
        };
        this.panel.setBackground(Color.white);
        this.panel.setPreferredSize(new Dimension(0,1400));



        this.parent.setVisible(true);

        this.setViewportView(panel);


    }



}


