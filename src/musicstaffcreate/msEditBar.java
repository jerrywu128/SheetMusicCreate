package musicstaffcreate;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class msEditBar extends JPanel {
    msToolbar parent;
    quarternoteButton quarter;
    eighthnoteButton eighth;
    sixteenthnoteButton sixteenth;
    wholenoteButton whole;
    restButton rest;
    noteButton note;
    halfnoteButton half;

    ButtonGroup type,length;//分為兩種群組按鈕音符休止符、長度

    JSeparator j;


    msEditBar(msToolbar p){


        parent = p;
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(0,50));

        this.setLayout(new FlowLayout());

        type =new ButtonGroup();
        length =new ButtonGroup();

        half =new halfnoteButton(this.parent);
        quarter = new quarternoteButton(this.parent);
        eighth = new eighthnoteButton(this.parent);
        sixteenth = new sixteenthnoteButton(this.parent);
        whole = new wholenoteButton(this.parent);
        rest =new restButton(this.parent);
        note =new noteButton(this.parent);



        j = new JSeparator(SwingConstants.VERTICAL);
        j.setBackground(new Color(0,0,0));
        j.setPreferredSize(new Dimension(10,30));


        this.add(new JLabel("輸入模式"));
        this.add(note);
        this.add(rest);
        type.add(rest);
        type.add(note);
        this.add(j);

        this.add(new JLabel("音符大小"));

        this.add(quarter);
        this.add(eighth);
        this.add(sixteenth);
        this.add(half);
        this.add(whole);

        length.add(quarter);
        length.add(eighth);
        length.add(sixteenth);
        length.add(half);
        length.add(whole);



    }


}
