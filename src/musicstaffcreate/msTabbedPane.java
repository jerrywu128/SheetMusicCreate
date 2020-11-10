package musicstaffcreate;
//This is a TabbedPane you can setting the msStaffPage in tab.
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener;



public class msTabbedPane extends JTabbedPane {


    MainWin parent;

    @Override
    public void addTab(String title, final Component content) {
        JPanel tab = new JPanel(new BorderLayout());
        JLabel label = new JLabel(title);
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 4));
        CloseTabButton closeTabButton = new CloseTabButton(this,content);
        closeTabButton.setBorder(BorderFactory.createEmptyBorder());


        tab.add(label, BorderLayout.WEST);
        tab.add(closeTabButton, BorderLayout.EAST);
        tab.setOpaque(false);
        tab.setBorder(BorderFactory.createEmptyBorder(2, 1, 1, 1));
        super.addTab(title, content);
        setTabComponentAt(getTabCount() - 1, tab);
    }

    msTabbedPane(MainWin p){
        parent = p;



        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(0,0));


        this.parent.setVisible(true);


    }

}


class CloseTabButton extends JButton{

    msTabbedPane parent;



    public CloseTabButton(msTabbedPane p,final Component c) {
        parent = p;

        this.setText("x");
        this.setPreferredSize(new Dimension(17, 17));
        this.setToolTipText("關閉頁籤");
        this.setUI(new BasicButtonUI());
        this.setContentAreaFilled(false);
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setBorderPainted(false);

        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(255,0,0));
        this.setOpaque(true);
        this.setRolloverEnabled(true);

        this.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                doSomething(c);
            }

        });

    }
     public void doSomething(final Component c){
         this.parent.removeTabAt(this.parent.indexOfComponent(c));
     }

}