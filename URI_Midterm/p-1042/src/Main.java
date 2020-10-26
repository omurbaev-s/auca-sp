import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        if (a<=b && b<=c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } if (a<=c && c<=b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } if (b<=a && a<=c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } if (b<=c && c<=a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } if (c<=a && a<=b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } if (c<=b && b<=a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }


    }
}
