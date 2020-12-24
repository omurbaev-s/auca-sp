import processing.core.*;

public class Main extends PApplet {
    float x=0;
    float y=0;

    public void settings() {
        fullScreen();
        size(400,400);
    }

    public void setup() {
        background(0);
        stroke(0,0,255);
        strokeWeight(2);

    }
    public void draw() {
        fill(0,0,0);
        rect(350, 50, 650, 650);
        while(x<width){
            line(x,0,x,height);
            x+=50;
        }
        while(y<height){
            line(0,y,width,y);
            y+=50;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
    }
