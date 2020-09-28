import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double C = inp.nextDouble();

        double F = (9.0 / 5) * C + 32;

        System.out.print(C + " Celsius is " + F + " Fahrenheit");
    }
}
