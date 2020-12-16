import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.printf("%.4f%n", sumSeries(x));
    }

    public static double sumSeries(int number) {
        double r = 0;
        for (int i = 1; i <= number; i++) {
            r += i / (i + 1.0);
        }
        return r;
    }
}
