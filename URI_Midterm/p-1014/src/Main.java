import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int X = inp.nextInt();
        double Y = inp.nextDouble();

        double Z = X/Y;

        System.out.printf("%.3f km/l%n", Z);
    }
}
