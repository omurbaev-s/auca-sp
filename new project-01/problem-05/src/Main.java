import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    int N;
    float x1;
    float y1;
    float blocks;
    float boardWidth;
    float boardHeight;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        N =Integer.parseInt(JOptionPane.showInputDialog("Enter the board's size [4, 12]"));

        try {
            if (N < 4 || N > 12) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null, "Invalid number" + N);
            System.exit(1);
        }


        boardWidth = width / 2f;
        boardHeight = height / 2f;
        blocks = boardWidth / N;
        x1 = (width - boardWidth) / 2f;
        y1 = 50;

    }

    public void draw() {
        background(255);
        fill(0);
        rect(x1,50,boardWidth,height-100);



    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}