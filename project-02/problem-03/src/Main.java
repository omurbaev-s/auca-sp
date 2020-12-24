import processing.core.*;
import javax.swing.*;
public class Main extends PApplet {
    int n;
    int[] blueC;
    float coordinateX;
    float coordinateY;
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
        coordinateX=width/2f;
        coordinateY=height/2f;
        x=new float[n];
        dx=new float[n];
        y=new float[n];
        dy=new float[n];
        blueC=new int[n];
        for(int i=0; i<n; i++) {
            x[i] = coordinateX;
            y[i] = coordinateY;
            dx[i] = D;
            dy[i] = D;
            coordinateX+=35;
            coordinateY+=35;
            blueC[i]=255;
        }
    }

    public void draw() {
        fill(0,0,0);
        rect(0,0, width-1, height-1);
        for(int i=0; i<n; i++) {
            fill(0,0,blueC[i]);
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