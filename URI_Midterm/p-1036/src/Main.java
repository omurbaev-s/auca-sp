import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

       double r1;
       double r2;

        if (a!=0 && b!=0 && c!=0 && ((b*b)-(4.0*a*c)>0)) {
           r1 = ((-b+Math.sqrt((b*b)-(4.0*a*c)))/(2*a));
           r2 = ((-b-Math.sqrt((b*b)-(4.0*a*c)))/(2*a));

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
