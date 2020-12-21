import processing.core.*;

public class Main extends PApplet {
    final float D=50;
    float x;
    float y;
    float dx;
    float dy;

    public void settings() {
       fullScreen();
    }

    public void setup() {
        frameRate(10);
        x=width/2f;
        y=height/2f;
        dx=D;
        dy=0;
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0, width-1, height-1);
        fill(255,0,0);
        circle(x, y, D);
        if(key==CODED){
            if(keyCode==UP){
                dx=0;
                dy=-D;
            }if(keyCode==DOWN){
                dx=0;
                dy=D;
            }if(keyCode==LEFT){
                dx=-D;
                dy=0;
            }if(keyCode==RIGHT){
                dx=D;
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