import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");

        double p = inp.nextDouble();

        final double KILOGRAMS_IN_POUND = 0.454;

        double k = p*KILOGRAMS_IN_POUND;

        System.out.print(p + " pounds is " + k + " kilograms");
    }
}
