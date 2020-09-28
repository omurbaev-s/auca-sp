import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();

        double weightA=2.0;
        double weightB=3.0;
        double weightC=5.0;

        double MEDIA = (A*weightA+B*weightB+C*weightC)/10.0;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
