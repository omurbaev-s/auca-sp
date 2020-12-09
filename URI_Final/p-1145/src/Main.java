import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int X, Y;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();
        if (X < Y) {
            for (int i = 1; i <= Y; i--) {
                for (int j = 1; j <= 3; i++) {
                    System.out.print(i + " ");
                    j++;
                }
                i++;
                System.out.println(" ");
            }
        }
    }
}