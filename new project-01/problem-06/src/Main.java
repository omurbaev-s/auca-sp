import processing.core.*;

public class Main extends PApplet {
    final int R_WIDTH=300;
    final int R_HEIGHT=350;
    int rLeft;
    int rTop;
    int rRight;
    int rBottom;
    int rLeft1;
    int rTop1;
    int rRight1;
    int rBottom1;
    float x;
    float y;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x=width/2f;
        y=height/2f;
        rLeft=(width/6);
        rTop=(height/2)-R_HEIGHT/2;
        rRight=rLeft+R_WIDTH;
        rBottom=rTop+R_HEIGHT;
        rLeft1=(width/2)+R_WIDTH/2;
        rTop1=(height/2)-R_HEIGHT/2;
        rRight1=rLeft+R_WIDTH;
        rBottom1=rTop+R_HEIGHT;
    }

    public void draw() {
        background(0);
        fill(0);
        stroke(255);
        rect(rLeft, rTop, R_WIDTH, R_HEIGHT);
        stroke(255);
        rect(rLeft1, rTop1, R_WIDTH, R_HEIGHT);
        fill(0,150,150);
        noStroke();
        circle(x, y, 50);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}