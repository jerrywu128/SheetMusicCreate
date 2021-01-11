package musicstaffcreate;
import  java.awt.*;
import javax.swing.*;


public class msBaseMenu extends JPanel{
    msToolbar parent;

    newStaffButton newStaff;
    openfileButton openfile;
    saveStaffButton savefile;
   // backButton back;
    forwardButton forward;


    msBaseMenu(msToolbar p){

        parent = p;

        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(0,45));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        newStaff =new newStaffButton(this.parent);
        openfile =new openfileButton(this.parent);
        savefile =new saveStaffButton(this.parent);
       // back= new backButton(this.parent);
        forward = new forwardButton(this.parent);




        this.setLayout(new BoxLayout(msBaseMenu.this,BoxLayout.X_AXIS));
        this.add(newStaff);
        this.add(openfile);
        this.add(savefile);
        //this.add(back);
        this.add(forward);



    }

}
