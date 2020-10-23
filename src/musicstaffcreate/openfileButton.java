package musicstaffcreate;

import javax.swing.*;

public class openfileButton extends msButton{

    openfileButton(msToolbar p) {
        super(p);
        this.setBorderPainted(false);
        this.setBorder(null);


        imageURL   = cldr.getResource("icon/folder.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("開啟檔案");
    }

    public void doSomething(){


    }

}
