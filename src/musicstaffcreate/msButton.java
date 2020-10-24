package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class msButton extends JButton {

    msToolbar parent;


    ClassLoader cldr ;
    java.net.URL imageURL;
    public ImageIcon icon ;

    msButton(msToolbar p){

        super();
        parent = p;
        cldr = this.getClass().getClassLoader();
        imageURL   = cldr.getResource("icon/piano.png");//預設icon
        icon =new ImageIcon(imageURL);//set button icon

        this.setToolTipText("piano");//設定滑鼠移動到按鈕上顯示的標籤

        this.setIcon(icon);

        this.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                doSomething();
            }

        });

    }

    public void doSomething(){}
}
