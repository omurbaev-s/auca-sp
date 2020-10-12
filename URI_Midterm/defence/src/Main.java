import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int distance = inp.nextInt();

        double fuel = inp.nextDouble();

        double con = distance/fuel;

        System.out.printf("%.3f km/l%n", con);

    }
}
