import processing.core.*;

public class Main extends PApplet {
    float size = 150;
    float x = width/2f;
    float ds=10;

    public void settings() {
        fullScreen();
    }

    public void setup() {
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
        text("World", x, height/2f);
        if(x>width){
            ds=-ds;
        } else if(x<0){
            ds=-ds;
        }
        x+=ds;


    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}