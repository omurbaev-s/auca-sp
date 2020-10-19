import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double formula = (b*b)-(4.0*a*c);
        double x = (-b)/2*a;

        double r1 = ((-b+Math.sqrt(formula))/(2*a));
        double r2 = ((-b-Math.sqrt(formula))/(2*a));

        if (formula>0) {
            System.out.printf("The equation has two roots %.6f and %.5f%n", r1, r2);
        } if (formula==0) {
            System.out.printf("The equation has one root %.0f%n", x);
        } if (formula<0) {
            System.out.println("The equation has no real roots");
        }

    }
}
