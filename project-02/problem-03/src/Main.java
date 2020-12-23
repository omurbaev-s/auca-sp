
import processing.core.*;

public class Main extends PApplet {
    float x;
    float y;
    float dx;
    float dy;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        dx = 10;
        dy = 10;
    }

    public void draw() {
        background(0, 0, 0);
        fill(0,0,255);
        ellipse(x, y, 50, 50);
        x+=dx;
        y+=dy;

        if(x>=width || x<0){
            dx = -dx;
        }if(y>=height || y<0){
            dy = -dy;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}