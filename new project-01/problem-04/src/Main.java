import processing.core.*;

public class Main extends PApplet {
    float x;
    float y;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x=width/2f;
        y=height/2f;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        circle(x, y, 100);
        x+=10;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}