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
    float[] a;
    float[] da;

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
        a=new float[n];
        da=new float[n];

        for(int i=0; i<n; i++) {
            r[i]=random(MIN_R, MAX_R);
            x[i] = random(1,width-1);
            y[i] = random(1,height-1);
            dx[i] = random(MIN_SPEED, r[i]/8);
            dy[i] = random(MIN_SPEED, r[i]/8);
            if(random(2)<1){
                dx[i]=-dx[i];
            } if(random(2)<1){
                dy[i]=-dy[i];
            }
            rc[i]=random(255);
            gc[i]=random(255);
            bc[i]=random(255);

            da[i]=random(0.05f,0.2f);
        }
        strokeWeight(3);
    }

    public void draw() {
        background(0);
        for(int i=0; i<n; i++) {
            stroke(rc[i], gc[i], bc[i]);
            drawStar(x[i], y[i], r[i], a[i]);

            if (x[i]+r[i] >= width) {
                dx[i] = -dx[i];
                da[i]=-da[i];
            }
            if (x[i]-r[i] < -1) {
                dx[i] = -dx[i];
                da[i]=-da[i];
            }
            if (y[i]+r[i] >= height) {
                dy[i] = -dy[i];
                da[i]=-da[i];
            }
            if (y[i]-r[i] < -1) {
                da[i]=-da[i];
                dy[i] = -dy[i];
            }
            x[i] += dx[i];
            y[i] += dy[i];
            a[i]+=da[i];
        }
    }

    void drawStar(float x, float y, float r, float a){
        pushMatrix();
        translate(x, y);
        rotate(a);
        for(int i=0; i<5; i++){
            line(0, -r, 0, r);
            rotate(2*PI/10);
        }
        popMatrix();
    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }

}