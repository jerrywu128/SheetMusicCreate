package musicstaffcreate;
// Just a pianokey can setting white and black keys.
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.jfugue.player.Player;
public class pianokeys extends JButton {

        msMidiDevice parent;


        ClassLoader cldr ;
        java.net.URL imageURL;
        public ImageIcon icon ;

        Color keycolor;

        pianokeys(msMidiDevice p){

            super();
            parent = p;
            this.setBackground(Color.white);
            this.setOpaque(true);



            this.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e){
                    keycolor = getBackground();
                    clicked();
                }
                public void mouseReleased(MouseEvent e){
                    release();
                }
                public void mouseClicked(MouseEvent e){
                    Player player = new Player();
                    player.play("I[Alto_Sax] C");

                }

            });

        }

        public void clicked(){
            System.out.println("clicked!");
            this.setBackground(Color.darkGray);
        }
        public void release(){
            this.setBackground(keycolor);

        }

    }


