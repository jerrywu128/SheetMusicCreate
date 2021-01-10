package musicstaffcreate;


import java.awt.*;
import javax.swing.*;



public class msEditBar extends JPanel {
    msToolbar parent;
    quarternoteButton quarter;
    eighthnoteButton eighth;
    sixteenthnoteButton sixteenth;
    wholenoteButton whole;
    restMode rest;
    noteMode note;
    halfnoteButton half;
    cursorMode cursor;
    inputType inputtype;
    longType longtype;
    ButtonGroup type,length;//分為兩種群組按鈕音符休止符、長度

    JSeparator j;


    msEditBar(msToolbar p){


        parent = p;
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(0,50));

        this.setLayout(new FlowLayout());


        inputtype= musicstaffcreate.inputType.Cursor;
        longtype=longType.non;

        type =new ButtonGroup();
        length =new ButtonGroup();
        cursor = new cursorMode(this);
        rest =new restMode(this);
        note =new noteMode(this);
        half =new halfnoteButton(this);
        quarter = new quarternoteButton(this);
        eighth = new eighthnoteButton(this);
        sixteenth = new sixteenthnoteButton(this);
        whole = new wholenoteButton(this);




        j = new JSeparator(SwingConstants.VERTICAL);
        j.setBackground(new Color(0,0,0));
        j.setPreferredSize(new Dimension(10,30));


        this.add(new JLabel("輸入模式"));
        this.add(cursor);
        this.add(note);
        this.add(rest);
        type.add(rest);
        type.add(note);
        type.add(cursor);
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

        this.setLengthEnable(false);


    }
    public void setLengthEnable(boolean b){
        this.half.setEnabled(b);
        this.quarter.setEnabled(b);
        this.eighth.setEnabled(b);
        this.sixteenth.setEnabled(b);
        this.whole.setEnabled(b);
    }
    public void setTypeEnable(boolean b){
        this.note.setEnabled(b);
        this.rest.setEnabled(b);
        this.cursor.setEnabled(b);
    }

    public void resetlongButtongroup(){
        length.remove(quarter);
        length.remove(eighth);
        length.remove(sixteenth);
        length.remove(half);
        length.remove(whole);
        quarter.setSelected(false);
        eighth.setSelected(false);
        sixteenth.setSelected(false);
        half.setSelected(false);
        whole.setSelected(false);
        length.add(quarter);
        length.add(eighth);
        length.add(sixteenth);
        length.add(half);
        length.add(whole);
    }

}
