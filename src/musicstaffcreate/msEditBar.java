package musicstaffcreate;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class msEditBar extends Panel {
    msToolbar parent;
    quarternoteButton quarter;
    eighthnoteButton eighth;
    sixteenthnoteButton sixteenth;
    wholenoteButton whole;
    restButton rest;
    noteButton note;
    halfnoteButton half;
  
    JSeparator j;


    msEditBar(msToolbar p){


        parent = p;
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(0,40));
        this.setLayout(new FlowLayout());
        quarter = new quarternoteButton(this.parent);
        eighth = new eighthnoteButton(this.parent);
        sixteenth = new sixteenthnoteButton(this.parent);
        whole = new wholenoteButton(this.parent);
        rest =new restButton(this.parent);
        note =new noteButton(this.parent);
        half =new halfnoteButton(this.parent);

        j = new JSeparator(SwingConstants.VERTICAL);
        j.setBackground(new Color(0,0,0));
        j.setPreferredSize(new Dimension(10,30));


        this.add(new JLabel("輸入模式"));
        this.add(note);
        this.add(rest);
        this.add(j);

        this.add(new JLabel("音符大小"));

        this.add(quarter);
        this.add(eighth);
        this.add(sixteenth);
        this.add(half);
        this.add(whole);




    }


}
