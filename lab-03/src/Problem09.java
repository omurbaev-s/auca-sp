import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 3);
        Scanner inp = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int user = inp.nextInt();

        if (number1 == 0 && user == 0) {
            System.out.println("The computer is scissor. You are scissor too. It is a draw");
        } else if (number1 == 0 && user == 1) {
            System.out.println("The computer is scissor. You are rock. You won");
        } else if (number1 == 0 && user == 2) {
            System.out.println("The computer is scissor. You are paper. You lost");
        } else if (number1 == 1 && user == 0) {
            System.out.println("The computer is rock. You are scissor. You lost");
        } else if (number1 == 1 && user == 1) {
            System.out.println("The computer is rock. You are rock too. It is a draw");
        } else if (number1 == 1 && user == 2) {
            System.out.println("The computer is rock. You are paper. You won");
        } else if (number1 == 2 && user == 0) {
            System.out.println("The computer is paper. You are scissor. You won");
        } else if (number1 == 2 && user == 1) {
            System.out.println("The computer is paper. You are rock. You lost");
        } else if (number1 == 2 && user == 2) {
            System.out.println("The computer is paper. You are paper too. It is a draw");
        }
    }
}
