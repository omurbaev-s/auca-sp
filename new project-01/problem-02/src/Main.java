import processing.core.*;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0);
        textSize(60);
        textAlign(CENTER, CENTER);
        text("Hello,", width/2f, height/2f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}