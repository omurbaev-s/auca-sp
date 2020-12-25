import processing.core.*;
import javax.swing.*;
public class Main extends PApplet {
    float size = 140;
    float x;
    float x1;
    float ds;
    float ds1;
    float speed;
    String firstWord, secondWord;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        firstWord= JOptionPane.showInputDialog("First word");
        secondWord = JOptionPane.showInputDialog("Second word");
        x=width/2f;
        x1=width/2f;
        speed=5;
    }

    public void draw() {
        background(0);
        fill(255,0,0);
        textSize(size);
        textAlign(CENTER, BOTTOM);
        text(firstWord, x, height/2.7f);
        fill(0,255,0);
        textSize(size);
        textAlign(CENTER, CENTER);
        text(secondWord, x1, height/2f);
        if(x+(textWidth(firstWord)/2f)>width || x-(textWidth(firstWord)/2f)<0){
            speed=-speed;
        } if(x1+(textWidth(secondWord)/2f)>width || x1-(textWidth(secondWord)/2f)<0) {
            ds1 = -ds1;
        }

        ds=(width/2f-(textWidth(firstWord)/2))/speed;
        ds1=(width/2f-(textWidth(secondWord)/2))/ds;

        x+=speed;
        x1-=ds1;

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}