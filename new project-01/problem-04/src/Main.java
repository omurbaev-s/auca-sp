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
        circle(x1+30, y1+30, size);
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

        x=350;
        y=50;
        size=650/D;
        while(x<=width-350){
            stroke(0,0,100);
            line(x,y,x,700);
            x+=size;
        }
        while(y<height-60){
            stroke(0,0,100);
            line(350,y,width-365,y);
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