package musicstaffcreate;
// Just a pianokey can setting white and black keys.
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.jfugue.player.Player;
public class pianokeys extends JButton {

    char[] musical＿alphabet = {'C', 'D', 'E', 'F', 'G', 'A', 'B', 'C', 'D', 'F', 'G', 'A'};

    char[] keyboard_key = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'A', 'S', 'D', 'F', 'G', 'H', 'J'};

    msMidiDevice parent;


    ClassLoader cldr;
    java.net.URL imageURL;
    public ImageIcon icon;

    Color keycolor;

    pianokeys(msMidiDevice p, int alph, char color) {

        super();
        parent = p;
        this.setBackground(Color.white);
        this.setOpaque(true);
        this.setFocusable(false);


        this.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                keycolor = getBackground();
                clicked();
            }

            public void mouseReleased(MouseEvent e) {
                release();
            }

            public void mouseClicked(MouseEvent e) {
                dothom(alph,color);
            }
        });


            /*this.addKeyListener(new KeyAdapter() {
                Player player = new Player();
                                    @Override
                                    public void keyPressed(KeyEvent e) {
                                        super.keyPressed(e);

                                         for(int i=0;i<7;i++) {
                                             if (e.getKeyChar() == keyboard_key[i]) {
                                                 player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[i] + parent.Octave + "i");
                                             }
                                             else if (e.getKeyChar() == keyboard_key[i+7]){
                                                 player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[i] + (parent.Octave+1)+"i");
                                             }
                                         }
                                    }

                                }
            );*/



    }
    public void dothom(int alph,char color) {
        Player player = new Player();
        if (color == 'w') {
            if (alph < 7) {
                player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[alph] + parent.Octave+"i");
            } else {
                player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[alph - 7] + (parent.Octave + 1)+"i");
            }
        } else if (color == 'b') {

            if (alph < 5) {
                player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[alph + 7] + "#" + parent.Octave+"i");
            } else {
                player.play("I[" + parent.MIDI_Ins + "] " + musical＿alphabet[alph + 7 - 5] + "#" + (parent.Octave + 1)+"i");
            }

        }
    }
    public void clicked() {
        System.out.println("clicked!");
        this.setBackground(Color.darkGray);
    }

    public void release() {
        this.setBackground(keycolor);
    }


}

