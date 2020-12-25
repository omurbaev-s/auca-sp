import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {
    float table;
    float D=50;
    float x;
    float y;
    float size;
    float x1;
    float y1;
    float dx;
    float dy;
    final int RECT_WIDTH=650;
    final int RECT_HEIGHT=650;

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
        table=650;
        size=table/D;
        frameRate(10 );
        x1=width/2f-(650/2f)+size/2;
        y1=height/2f-(650/2f)+size/2;
        dx=0;
        dy=0;

        background(0);
        strokeWeight(2);

    }
    public void draw() {
        fill(0,0,0,50);
        noStroke();
        rect(0,0,width-1,height-1);
        fill(255,0,0);
        noStroke();
        circle(x1, y1, size);
        if(key==CODED){
            if(keyCode==UP){
                dx=0;
                dy=-size;
            }if(keyCode==DOWN){
                dx=0;
                dy=size;
            }if(keyCode==LEFT){
                dx=-size;
                dy=0;
            }if(keyCode==RIGHT){
                dx=size;
                dy=0;
            }
        }
        x1+=dx;
        y1+=dy;

        x=358;
        y=58;
        size=650/D;
        while(x<=width-310){
            stroke(0,0,100);
            line(x,y,x,705);
            x+=size;
        }
        while(y<height-10){
            stroke(0,0,100);
            line(358,y,width-360,y);
            y+=size;
        }
        if (x1 > (width / 2f + 650/2f) - size / 2f) {
            dx = 0;
            dy = 0;
            x1 = (width / 2f + 650/2f) - size / 2f;
        } else if (x1 < ((width / 2f) - 650/2f) + size / 2f) {
            dx = 0;
            dy = 0;
            x1 = ((width / 2f) - 650/2f) + size / 2f;
        } else if (y1 > ((height / 2f) + 650/2f) - size/ 2f){
            dx = 0;
            dy = 0;
            y1 = ((height / 2f) + 650/2f) - size/ 2f;
        } else if (y1 < ((height / 2f) - 650/2f) + size/ 2f){
            dx = 0;
            dy = 0;
            y1 = ((height / 2f) - 650/2f) + size/ 2f;
        }


    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}