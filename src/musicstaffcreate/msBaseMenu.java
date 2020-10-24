package musicstaffcreate;
import  java.awt.*;
import javax.swing.*;


public class msBaseMenu extends Panel{
    msToolbar parent;

    newStaffButton newStaff;
    openfileButton openfile;
    saveStaffButton savefile;
    backButton back;
    forwardButton forward;
    playButton play;
    endPlayButton endplay;

    msBaseMenu(msToolbar p){

        parent = p;

        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(0,35));
        newStaff =new newStaffButton(this.parent);
        openfile =new openfileButton(this.parent);
        savefile =new saveStaffButton(this.parent);
        back= new backButton(this.parent);
        forward = new forwardButton(this.parent);
        play =new playButton(this.parent);
        endplay =new endPlayButton(this.parent);



        this.setLayout(new BoxLayout(msBaseMenu.this,BoxLayout.X_AXIS));
        this.add(newStaff);
        this.add(openfile);
        this.add(savefile);
        this.add(back);
        this.add(forward);
        this.add(play);
        this.add(endplay);

    }

}
