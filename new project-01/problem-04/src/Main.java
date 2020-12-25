import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {
    float D=50;
    float x=350;
    float y=50;
    float size;
    final float D1=50;
    float x1;
    float y1;
    float dx;
    float dy;
    final int RECT_WIDTH=650;
    final int RECT_HEIGHT=650;
    int rectLeft;
    int rectTop;
    int rectRight;
    int rectBottom;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String num =JOptionPane.showInputDialog("Input  from 10-40");
        try{
            D=Integer.parseInt(num);

        }catch (NumberFormatException e){
            System.out.println("Error  input is "+e);
            System.exit(0);
        }
        frameRate(10 );
        x1=x;
        y1=y;
        dx=0;
        dy=0;

        background(0);
        strokeWeight(2);
        fill(255);
        rect(x, y, RECT_WIDTH, RECT_HEIGHT);
    }
    public void draw() {

        fill(255,0,0);
        circle(x1, y1, size);
        if(key==CODED){
            if(keyCode==UP){
                dx=0;
                dy=-D1;
            }if(keyCode==DOWN){
                dx=0;
                dy=D1;
            }if(keyCode==LEFT){
                dx=-D1;
                dy=0;
            }if(keyCode==RIGHT){
                dx=D1;
                dy=0;
            }
        }
        x1+=dx;
        y1+=dy;



    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}