import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        double t;

        if (x==1) {
            t=4.00*y;
            System.out.printf("Total: R$ %.2f%n", t);
        } if (x==2) {
            t=4.50*y;
            System.out.printf("Total: R$ %.2f%n", t);
        } if (x==3) {
            t=5.00*y;
            System.out.printf("Total: R$ %.2f%n", t);
        } if (x==4) {
            t=2.00*y;
            System.out.printf("Total: R$ %.2f%n", t);
        } if (x==5) {
            t=1.50*y;
            System.out.printf("Total: R$ %.2f%n", t);
        }
    }
}
