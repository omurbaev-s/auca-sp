
import processing.core.*;

public class Main extends PApplet {
    float x,x1,x2;
    float y,y1,y2;
    float dx;
    float dy;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width/2f;
        y = height/2f;
        x1=width/3f;
        y1=height/3f;
        x2=width/4f;
        y2=height/4f;
        dx=10;
        dy=10;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        fill(0,255,0);
        fill(0,0,255);
        ellipse(x, y, 50, 50);
        ellipse(x1,y1,50, 50);
        ellipse(x2,y2,50, 50);
        x+=dx;
        y+=dy;

        if(x>=width){
            dx = -dx;
            x = width-1;
            x1= width-1;
            x2= width-1;
        } if (x<0){
            dx = -dx;
            x = 0;
            x1 = 0;
            x2 = 0;
        }if (y>=height) {
            dy = -dy;
            y = height-1;
            y1 = height-1;
            y2 = height-1;
        } if(y<0) {
            dy = -dy;
            y = 0;
            y1 = 0;
            y2 = 0;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}