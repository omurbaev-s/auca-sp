import processing.core.*;

public class Main extends PApplet {

    float angle=0;
    float dAngle=0.05f;
    float angle1=0;
    float dAngle1=0.01f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        translate(width/2f,height/2f);
        circle(0,0,200);
        rotate(angle);
        circle(width/6f,0,100);
        angle+=dAngle;

        translate(width/6f,0);
        circle(width/20f,0,20);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}