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
        background(0);
        fill(255);
        rect(x1,50,boardWidth,height-100);
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                float x = x1 +j* blocks;
                float y = y1 + i* blocks;
                fill((i + j) % 2 == 0 ? 255 : 0);
                square(x, y, blocks);
                if (mouseX >= x && mouseX <= x + blocks && mouseY >= y && mouseY <= y + blocks) {
                    stroke(255, 0, 0);
                    strokeWeight(4);
                    textAlign(CENTER);
                    String msg = "Row: " + i + " ; Column: " + j + "; Color:" + ((i + j) % 2 == 0 ? "White" : "Black");
                    square(x, y, blocks - 1);
                    textSize(30);
                    fill(0, 0, 255);
                    text(msg, width / 2f, 25);
                    noStroke();
                }

            }
        }



    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}