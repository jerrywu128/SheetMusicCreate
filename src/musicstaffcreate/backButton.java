package musicstaffcreate;

import javax.swing.*;

public class backButton extends msButton{

    backButton(msToolbar p){

        super(p);

        //隱藏按鈕外誆

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/back.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("返回上一步");

    }
    public void doSomething(){


    }

}
