package musicstaffcreate;

import javax.swing.*;

public class forwardButton extends msButton{

    forwardButton(msToolbar p){

        super(p);

        //隱藏按鈕外誆

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/forward.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("返回下一步");

    }
    public void doSomething(){


    }

}
