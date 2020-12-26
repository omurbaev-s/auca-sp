import processing.core.*;
import javax.swing.*;
public class Main extends PApplet {
    final float MIN_R=5;
    final float MAX_R=50;
    final float MIN_SPEED=1;
    final float MAX_SPEED=MAX_R/2f;
    int n;
    float[] r;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    final float D=2;

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

        for(int i=0; i<n; i++) {
            r[i]=random(MIN_R, MAX_R);
            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(MIN_SPEED, r[i]/4);
            dy[i] = random(MIN_SPEED, r[i]/4);
        }
    }

    public void draw() {
        fill(0,0,0);
        rect(0,0, width-1, height-1);
        for(int i=0; i<n; i++) {
            fill(255);
            circle(x[i], y[i], 50);

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

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}