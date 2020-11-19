import processing.core.*;

public class Main extends PApplet {
    float x;
    float y;
    float dx;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width/2f;
        y = height/2f;
        dx=10;
    }

    public void draw() {
        background(0, 0, 0);
        ellipse(x, height/2f, 50, 50);
        x+=dx;
        if(x>=width){
            dx = -dx;
            x = width-1;
        } if (x<0){
            dx = -dx;
            x = 0;
        } if (y>=height) {
            dx = -dx;
            y = height-1;
        } if(y<0){
            dx=-dx;
            y=0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}