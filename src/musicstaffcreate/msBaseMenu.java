package musicstaffcreate;
import  java.awt.*;
import javax.swing.*;


public class msBaseMenu extends Panel{
    msToolbar parent;

    newStaffButton newStaff;
    openfileButton openfile;
    saveStaffButton savefile;

    msBaseMenu(msToolbar p){

        parent = p;

        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(0,35));
        newStaff =new newStaffButton(this.parent);
        openfile =new openfileButton(this.parent);
        savefile =new saveStaffButton(this.parent);

        this.setLayout(new BoxLayout(msBaseMenu.this,BoxLayout.X_AXIS));
        this.add(newStaff);
        this.add(openfile);
        this.add(savefile);

    }

}
