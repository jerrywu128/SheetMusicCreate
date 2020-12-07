package musicstaffcreate;

import javax.swing.*;

public class saveStaffButton extends msButton{

    saveStaffButton(msToolbar p){

        super(p);

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/floppy.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("儲存檔案");





    }

    public void doSomething(){



    }


}
