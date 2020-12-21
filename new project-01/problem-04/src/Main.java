import processing.core.*;

public class Main extends PApplet {
    float x;
    float y;
    float dx;
    float dy;

    public void settings() {
       fullScreen();
    }

    public void setup() {
        x=width/2f;
        y=height/2f;
        dx=10;
        dy=0;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        circle(x, y, 100);
        if(key==CODED){
            if(keyCode==UP){
                dx=0;
                dy=-10;
            }if(keyCode==DOWN){
                dx=0;
                dy=10;
            }if(keyCode==LEFT){
                dx=-10;
                dy=0;
            }if(keyCode==RIGHT){
                dx=10;
                dy=0;
            }
        }

        x+=dx;
        y+=dy;

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}