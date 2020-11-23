import processing.core.*;

public class Problem05 extends PApplet {
    final int N = 15;
    int d = 700;
    int fMax = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);
        noStroke();


        for (int i = 0; i<N; ++i) {
            fill(fMax, 0, 0);
            ellipse(width / 2f, height / 2f, d, d);
            d -= 50;
            fMax +=17;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}