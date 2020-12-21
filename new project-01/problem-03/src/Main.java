import processing.core.*;

public class Main extends PApplet {
    float size = 150;
    float x;
    float x1;
    float ds;
    float ds1;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x=width/2f;
        x1=width/2f;
        ds=10;
        ds1=10;
    }

    public void draw() {
        background(0);
        fill(255,0,0);
        textSize(size);
        textAlign(CENTER, BOTTOM);
        text("Hello,", x, height/2.7f);
        fill(0,255,0);
        textSize(size);
        textAlign(CENTER, CENTER);
        text("World", x1, height/2f);
        if(x>width || x<0){
            ds=-ds;
        } else if(x1>width || x1<0){
            ds1=-ds1;
        }
        x+=ds;
        x1-=ds1;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}