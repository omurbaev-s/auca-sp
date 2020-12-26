import processing.core.*;

public class Main extends PApplet {

    float angle=PI/4;
    float dAngle=0.05f;
    float angle1=PI;
    float dAngle1=0.01f;
    float angle2=PI/6;
    float dAngle2=0.07f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        translate(width/2f,height/2f);
        fill(255,255,0);
        circle(0,0,200);

        pushMatrix();
        rotate(angle);
        fill(0,0,255);
        circle(width/6f,0,100);

        translate(width/6f,0);
        rotate(angle1);
        fill(255);
        circle(width/20f,0,20);
        popMatrix();

        rotate(angle2);
        circle(width/12f,0,100);

        angle+=dAngle;
        angle1+=dAngle1;
        angle2+=dAngle2;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}