import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName = inp.nextLine();

        double s = inp.nextDouble();
        double tv = inp.nextDouble();

        double total = s+(tv*15/100);

        System.out.printf("TOTAL = R$ %.2f%n", total);

    }
}
