import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int whn = inp.nextInt();
        double aph = inp.nextDouble();

        double s = whn*aph;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n", s);

    }
}
