import processing.core.*;
import javax.swing.*;
public class Main extends PApplet {
    float size = 150;
    float x;
    float x1;
    float ds;
    float ds1;
    String firstWord, secondWord;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String word1 = JOptionPane.showInputDialog("Enter 1st word: ");
        firstWord=word1;
        String word2 = JOptionPane.showInputDialog("Enter 2nd word: ");
        secondWord=word2;
        x=width/2f;
        x1=width/2f;
        ds=10;
        ds1=10;
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
        if(x>width || x<0){
            ds=-ds;
        } if(x1>width || x1<0){
            ds1=-ds1;
        }
        x+=ds;
        x1-=ds1;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}