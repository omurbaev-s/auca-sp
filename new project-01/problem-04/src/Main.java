import processing.core.*;

public class Main extends PApplet {
    float x=350;
    float y=50;

    public void settings() {
        fullScreen();
        size(400,400);
    }

    public void setup() {

        background(0);
        stroke(0,0,255);
        strokeWeight(2);
        fill(0);
        rect(350, 50, 650, 650);
    }
    public void draw() {
        while(x<=width-350){
            line(x,y,x,700);
            x+=50;
        }
        while(y<height-50){
            line(350,y,width-365,y);
            y+=50;
        }

    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
    }
