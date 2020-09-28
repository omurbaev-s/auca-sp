import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

      double A = inp.nextDouble();
      double B = inp.nextDouble();

      double weightA=3.5;
      double weightB=7.5;

      double MEDIA = (A*weightA+B*weightB)/11.0;

        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}
