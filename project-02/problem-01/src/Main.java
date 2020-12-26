import processing.core.*;
import javax.swing.*;
public class Main extends PApplet {
    final float MIN_R=5;
    final float MAX_R=50;
    final float MIN_SPEED=1;

    int n;
    float[] r;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] rc;
    float[] gc;
    float[] bc;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try{
            n=Integer.parseInt(JOptionPane.showInputDialog("N?"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Incorrect int");
            System.exit(1);
        }
        r=new float[n];
        x=new float[n];
        dx=new float[n];
        y=new float[n];
        dy=new float[n];
        rc=new float[n];
        gc=new float[n];
        bc=new float[n];

        for(int i=0; i<n; i++) {
            r[i]=random(MIN_R, MAX_R);
            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(MIN_SPEED, r[i]/4);
            dy[i] = random(MIN_SPEED, r[i]/4);
            if(random(2)<1){
                dx[i]=-dx[i];
            } if(random(2)<1){
                dy[i]=-dy[i];
            }
            rc[i]=random(255);
            gc[i]=random(255);
            bc[i]=random(255);
        }
    }

    public void draw() {
        background(0);
        for(int i=0; i<n; i++) {
            fill(rc[i], gc[i], bc[i]);
            drawStar(x[i], y[i], r[i]);

            if (x[i] >= width) {
                dx[i] = -dx[i];
                x[i] = width - 1;
            }
            if (x[i] < 0) {
                dx[i] = -dx[i];
                x[i] = 0;
            }
            if (y[i] >= height) {
                dy[i] = -dy[i];
                y[i] = height - 1;
            }
            if (y[i] < 0) {
                dy[i] = -dy[i];
                y[i] = 0;
            }
            x[i] += dx[i];
            y[i] += dy[i];
        }
    }

    void drawStar(float x, float y, float r){
        pushMatrix();
        translate(x, y);
        for(int i=0; i<10; i++){
            line(0, -r, 0, r);
            rotate(2*PI/10);
        }
        popMatrix();
    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }

}