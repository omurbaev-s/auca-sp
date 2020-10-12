import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int hours = inp.nextInt();
        int speed = inp.nextInt();

        double liters = (hours*speed)/12.0;

        System.out.printf("%.3f%n", liters);

    }
}
