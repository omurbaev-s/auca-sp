import processing.core.*;

public class Main extends PApplet {
    final int R_WIDTH=300;
    final int R_HEIGHT=350;
    int rLeft;
    int rTop;
    int rRight;
    int rBottom;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        rLeft=(width/6);
        rTop=(height/2)-R_HEIGHT/2;
        rRight=rLeft+R_WIDTH;
        rBottom=rTop+R_HEIGHT;
    }

    public void draw() {
        background(0);
        fill(0);
        stroke(255);
        rect(rLeft, rTop, R_WIDTH, R_HEIGHT);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}