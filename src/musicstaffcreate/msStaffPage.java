package musicstaffcreate;
//This is a StaffPage you can edit note in this panel.

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;



public class msStaffPage extends JScrollPane{

    msTabbedPane parent;
    static int count=0;
    int id;
    JLabel note;


    ClassLoader cldr ;
    URL imageURL;
    public ImageIcon icon ,imageIcon;

    JComponent  panel;
    msLabel staffTitle,authorTitle,instrumentTitle,pageCount,measure[];


    msStaffPage(msTabbedPane p){

        parent = p;
        count++;
        id=count;
        this.getVerticalScrollBar().setUnitIncrement(10);

        String m[]={"1","5","9","13","17","21","25","29","33","37"};


        panel = new JComponent(){

            public void paintComponent(Graphics g){

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
                     }//小節

                    l+=125;
                }




                g.setFont(new Font("", 0, 18));


            }





        };
        this.panel.setLayout(null);


        staffTitle = new msLabel("Title",SwingConstants.CENTER,this);
        staffTitle.setLocation(340,33);
        staffTitle.setFont(new Font("標楷體",0,30));
        staffTitle.setSize(new Dimension(500,75));
        panel.add(staffTitle);


        authorTitle = new msLabel("author",SwingConstants.RIGHT,this);
        authorTitle.setLocation(750,120);
        authorTitle.setFont(new Font("標楷體",0,17));
        authorTitle.setSize(new Dimension(300,30));
        panel.add(authorTitle);

        instrumentTitle = new msLabel("Instrument",SwingConstants.LEFT,this);
        instrumentTitle.setLocation(100,100);
        instrumentTitle.setFont(new Font("標楷體",0,20));
        instrumentTitle.setSize(new Dimension(150,30));
        panel.add(instrumentTitle);

        pageCount = new msLabel("-" + id + "-",SwingConstants.CENTER,this);
        pageCount.setLocation(570,1350);
        pageCount.setFont(new Font("標楷體",0,17));
        pageCount.setSize(new Dimension(60,30));
        panel.add(pageCount);

        measure = new msLabel[10];
        int g=0;
        for(int i=0;i<10;i++){

            measure[i] = new msLabel(m[i],SwingConstants.CENTER,this);
            measure[i].setLocation(95,135+ i*10 + g);
            measure[i].setFont(new Font("標楷體",0,12));
            measure[i].setSize(new Dimension(25,20));
            panel.add(measure[i]);

            g+=115;
        }

        this.panel.setBackground(Color.white);
        this.panel.setPreferredSize(new Dimension(0,1400));



        this.parent.setVisible(true);

        this.setViewportView(panel);

        this.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                cldr = this.getClass().getClassLoader();
                if((parent.parent.toolbar.editBar.inputtype==inputType.Note)&&(parent.parent.toolbar.editBar.longtype!=longType.non)) {
                    if(parent.parent.toolbar.editBar.longtype==longType.quarter){
                        imageURL = cldr.getResource("icon/quarter-note-up.png");
                        icon = new ImageIcon(imageURL);
                        imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.eighth){
                        imageURL = cldr.getResource("icon/eighth-note-up.png");
                        icon = new ImageIcon(imageURL);
                        imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.sixteenth){
                        imageURL = cldr.getResource("icon/sixteenth-note-up.png");
                        icon = new ImageIcon(imageURL);
                        imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.half){
                        imageURL = cldr.getResource("icon/half-note-up.png");
                        icon = new ImageIcon(imageURL);
                        imageIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 45, Image.SCALE_DEFAULT));
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.whole){
                        imageURL = cldr.getResource("icon/whole-note.png");
                        icon = new ImageIcon(imageURL);
                        imageIcon = new ImageIcon(icon.getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT));
                    }

                }
                else if((parent.parent.toolbar.editBar.inputtype==inputType.rest)&&(parent.parent.toolbar.editBar.longtype!=longType.non)) {
                    if(parent.parent.toolbar.editBar.longtype==longType.quarter) {
                        imageURL = cldr.getResource("icon/quarter-note-rest.png");
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.eighth){
                        imageURL = cldr.getResource("icon/eighth-note-up.png");
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.sixteenth){
                        imageURL = cldr.getResource("icon/sixteenth-note-up.png");
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.half){
                        imageURL = cldr.getResource("icon/half-note-up.png");
                    }
                    else if(parent.parent.toolbar.editBar.longtype==longType.whole){
                        imageURL = cldr.getResource("icon/whole-note.png");
                    }

                    icon = new ImageIcon(imageURL);
                    imageIcon = new ImageIcon(icon.getImage().getScaledInstance(25, 30, Image.SCALE_DEFAULT));


                }

                if((parent.parent.toolbar.editBar.inputtype!=inputType.Cursor)&&(parent.parent.toolbar.editBar.longtype!=longType.non)) {


                    note = new JLabel(imageIcon);
                    if(parent.parent.toolbar.editBar.longtype==longType.whole){
                        note.setLocation(getMousePosition().x +7, getMousePosition().y - 10 + msStaffPage.this.getVerticalScrollBar().getValue());
                    }
                    else {
                        note.setLocation(getMousePosition().x - 18, getMousePosition().y - 18 + msStaffPage.this.getVerticalScrollBar().getValue());
                    }
                    note.setVisible(true);


                    note.setSize(30, 45);
                    panel.add(note);
                    panel.repaint();
                }
            }

        });


    }



}


