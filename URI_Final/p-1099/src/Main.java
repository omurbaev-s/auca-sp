import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();


        for (int i = 0; i < N; i++) {
            int sum = 0;
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X > Y) {
                for (int j = Y + 1; j < X; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
            } else {
                for (int k = X + 1; k < Y; k++) {
                    if (k % 2 != 0) {
                        sum += k;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}