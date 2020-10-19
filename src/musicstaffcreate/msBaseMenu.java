package musicstaffcreate;
import  java.awt.*;
import  java.awt.event.*;



public class msBaseMenu extends Panel{
    msToolbar parent;

    msBaseMenu(msToolbar p){

        parent = p;
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(0,35));

    }

}
