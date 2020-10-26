import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double P = a+b+c;
        double A = ((a+b)/2)*c;

        if (a+b>c && a+c>b && c+b>a) {
            System.out.println("Perimetro = "+P);
        } else {
            System.out.println("Area = "+A);

        }
    }
}
