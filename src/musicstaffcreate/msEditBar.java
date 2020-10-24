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





    msEditBar(msToolbar p){


        parent = p;
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(0,40));
        this.setLayout(new BoxLayout(msEditBar.this,BoxLayout.X_AXIS));
        quarter = new quarternoteButton(this.parent);
        eighth = new eighthnoteButton(this.parent);
        sixteenth = new sixteenthnoteButton(this.parent);
        whole = new wholenoteButton(this.parent);


        this.add(quarter);
        this.add(eighth);
        this.add(sixteenth);
        this.add(whole);

    }


}
