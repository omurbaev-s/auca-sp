import processing.core.*;

public class Main extends PApplet {
    final float MAX_SIZE = 150;
    float size = 150;
    float size1 = 30;
    float size2 = 150;
    float ds = 1;

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
        text("Hello,", width/2f, height/2f);
        textSize(size1);
        textAlign(CENTER, CENTER);
        text("Wonderful",width/2f, height/2f);
        if(size==MAX_SIZE || size==20){
            ds=-ds;
        } if(size1==MAX_SIZE || size==30){
            ds=-ds;
        }
        size+=ds;
        size1+=ds;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}