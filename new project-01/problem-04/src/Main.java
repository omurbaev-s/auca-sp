import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {
    float D=50;
    float x=350;
    float y=50;
    float size;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String num =JOptionPane.showInputDialog("Input  from 10-40");
        try{
            D=Integer.parseInt(num);

        }catch (NumberFormatException e){
            System.out.println("Error  input is "+e);
            System.exit(0);
        }

        background(0);
        stroke(0,0,255);
        strokeWeight(2);
        fill(0);
        rect(350, 50, 650, 650);
    }
    public void draw() {
        size=650/D;
        while(x<=width-350){
            line(x,y,x,700);
            x+=size;
        }
        while(y<height-50){
            line(350,y,width-365,y);
            y+=size;
        }

    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}