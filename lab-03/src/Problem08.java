import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        if (c<=b && b<=a) {
            System.out.println(c+", "+b+", "+a);
        } else if (c<=a && a<=b) {
            System.out.println(c+", "+a+", "+b);
        } else if (b<=c && c<=a) {
            System.out.println(b+", "+c+", "+a);
        } else if (b<=a && a<=c) {
            System.out.println(b+", "+a+", "+c);
        } else if (a<=b && b<=c) {
            System.out.println(a+", "+b+", "+c);
        } else if (a<=c && c<=b) {
            System.out.println(a+", "+c+", "+b);
        }

    }
}
