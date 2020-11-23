import processing.core.*;

public class Problem04 extends PApplet {
    final int N=100;
    final float MAX_R =150;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(1);
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<N; ++i){
            fill(random(10, 255), random(10, 255), random(10, 255));
            float d = random(0,MAX_R);
            ellipse(random(0,width), random(0,height), d, d);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}