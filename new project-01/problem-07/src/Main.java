import processing.core.*;

public class Main extends PApplet {
    float x,y;
    float angle=0;
    float dAngle=0.05f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        translate(width/2f,height/2f);
        rotate(angle);
        circle(width/6f,0,100);
        angle+=dAngle;
        fill(255,255,0);
        noStroke();
        circle(0,0,200);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}