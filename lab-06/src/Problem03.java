import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        drawStar(min(width, height)/3f, width/2f,  height/2f, 255f,0f,0f);
        drawStar(min(width, height)/6f, width/4f,  height/4f, 255f,255f,0f);
        drawStar(min(width, height)/6f, 3*width/4f,  height/4f, 255f,255f,0f);
        drawStar(min(width, height)/6f, width/4f,  3*height/4f, 255f,255f,0f);
        drawStar(min(width, height)/6f, 3*width/4f,  3*height/4f, 255f,255f,0f);

    }

    private void drawStar(float r, float x, float y, float redComp, float greenComp, float blueComp) {

        float x1 = x-r;
        float y1 = y;

        float x2 = x+r;
        float y2 = y;

        float x3 = x;
        float y3 = y-r;

        float x4 = x;
        float y4 = y+r;

        float x5=x-r/4;
        float y5=y+r/4;

        float x6=x+r/4;
        float y6=y-r/4;

        float x7=x-r/4;
        float y7=y-r/4;

        float x8=x+r/4;
        float y8=y+r/4;

        stroke(redComp,greenComp,blueComp);
        line(x1,y1,x2,y2);
        line(x3,y3,x4,y4);
        line(x5,y5,x6,y6);
        line(x7,y7,x8,y8);
        line(x1,y1,x7,y7);
        line(x1,y1,x5,y5);
        line(x7,y7,x3,y3);
        line(x6,y6,x3,y3);
        line(x6,y6,x2,y2);
        line(x8,y8,x2,y2);
        line(x8,y8,x4,y4);
        line(x5,y5,x4,y4);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}