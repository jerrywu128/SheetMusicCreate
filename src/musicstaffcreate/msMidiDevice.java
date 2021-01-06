package musicstaffcreate;
//This is device table you can play music this.
import org.jfugue.player.Player;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;


//The JlayeredPane container can cover component.
public class msMidiDevice extends JLayeredPane {
    MainWin parent;
    pianokeys whitekey[], blackkey[] ;
    int j=275;
    String Instrument_MIDIid [] ={("Piano"),("Clarinet"),("Flute"),("Alto_Sax"),("French_horn"),("trumpet"),("Trombone"),("Baritone_Sax"),("Tuba")};
    Color keycolor;
    char [][] keyboard_key = {{'a','s','d','f','g','h','j','a','s','d','f','g','h','j'},{'w','e','t','y','u','w','e','t','y','u'}};
    boolean Uppercase＿lowercase;

    String MIDI_Ins = Instrument_MIDIid[0];

    int Octave=5;

    msMidiDevice(MainWin p){

        parent = p;
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(0,250));
        whitekey = new pianokeys[14];
        blackkey = new pianokeys[10];
        Uppercase＿lowercase=false;

        for(int i =0;i<14;i++) {
//Piano key location
            whitekey[i] = new pianokeys(this,i,'w');



            whitekey[i].setBounds(225+i*68,25,70,220);
            whitekey[i].setOpaque(true);

            //whitekey[i].setBackground(Color.black);







            this.add(whitekey[i],DEFAULT_LAYER);



            if(i<10) {

                blackkey[i] = new pianokeys(this,i,'b');

                if((i==2)||(i==5)||(i==7)) j += 70;
                blackkey[i].setBounds(j+i*67  , 25, 40, 180);
                blackkey[i].setBackground(Color.black);
                blackkey[i].setBorderPainted(false);


                this.add(blackkey[i],PALETTE_LAYER);
            }







        }

        parent.addKeyListener(new KeyAdapter() {


                                  @Override
                                  public void keyPressed(KeyEvent e) {
                                      super.keyPressed(e);
                                      if (e.getKeyCode() == KeyEvent.VK_ALT){
                                            if(!Uppercase＿lowercase)
                                                Uppercase＿lowercase=true;
                                            else
                                                Uppercase＿lowercase=false;
                                      }

                                      for(int i=0;i<14;i++) {
                                          if ((e.getKeyChar() == keyboard_key[0][i])&&(Uppercase＿lowercase==false)&&(i<7)) {

                                              keycolor = whitekey[i].getBackground();
                                              whitekey[i].setBackground(Color.darkGray);

                                          }
                                          else if((e.getKeyChar() == keyboard_key[0][i])&&(Uppercase＿lowercase==true)&&(i>=7)){

                                              keycolor = whitekey[i].getBackground();
                                              whitekey[i].setBackground(Color.darkGray);
                                          }
                                      }

                                      for(int i=0;i<10;i++) {
                                          if ((e.getKeyChar() == keyboard_key[1][i])&&(Uppercase＿lowercase==false)&&(i<5)) {

                                              keycolor = blackkey[i].getBackground();
                                              blackkey[i].setBackground(Color.darkGray);
                                          }
                                          else if((e.getKeyChar() == keyboard_key[1][i])&&(Uppercase＿lowercase==true)&&(i>=5)){

                                              keycolor = blackkey[i].getBackground();
                                              blackkey[i].setBackground(Color.darkGray);
                                          }
                                      }

                                  }

                                  @Override
                                  public void keyReleased(KeyEvent e) {
                                      super.keyReleased(e);
                                      for(int i=0;i<14;i++) {
                                          if ((e.getKeyChar() == keyboard_key[0][i])&&(Uppercase＿lowercase==false)&&(i<7)) {
                                              whitekey[i].setBackground(keycolor);
                                              whitekey[i].dothom(i,'w');
                                          }
                                          else if((e.getKeyChar() == keyboard_key[0][i])&&(Uppercase＿lowercase==true)&&(i>=7)){
                                              whitekey[i].setBackground(keycolor);
                                              whitekey[i].dothom(i,'w');
                                          }
                                      }
                                      for(int i=0;i<10;i++) {
                                          if ((e.getKeyChar() == keyboard_key[1][i])&&(Uppercase＿lowercase==false)&&(i<5)) {
                                              blackkey[i].setBackground(keycolor);
                                              blackkey[i].dothom(i,'b');
                                          }
                                          else if((e.getKeyChar() == keyboard_key[1][i])&&(Uppercase＿lowercase==true)&&(i>=5)){
                                              blackkey[i].setBackground(keycolor);
                                              blackkey[i].dothom(i,'b');
                                          }
                                      }

                                  }


                              }

        );
        parent.requestFocus();
    }


}
