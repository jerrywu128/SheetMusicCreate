package musicstaffcreate;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
import java.net.URL;

public class msToggleButton extends JToggleButton {

    msToolbar parent;


    ClassLoader cldr ;
    URL imageURL;
    public ImageIcon icon ;


    msToggleButton(msToolbar p){

        super();
        parent = p;
        cldr = this.getClass().getClassLoader();
        imageURL   = this.cldr.getResource("icon/piano.png");//預設icon
        icon =new ImageIcon(imageURL);//set button icon



        UIManager.put("ToolTip.background", Color.DARK_GRAY);
        UIManager.put("ToolTip.foreground", Color.WHITE);
        UIManager.put("ToolTip.font",
                new FontUIResource("SansSerif", Font.BOLD, 14));

        this.setToolTipText("piano");//設定滑鼠移動到按鈕上顯示的標籤
        this.setFocusable(false);

        this.setIcon(icon);

        this.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                doSomething();
            }

        });

    }

    public void doSomething(){}
}
