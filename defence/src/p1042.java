import java.util.Scanner;

public class p1042 {
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
        } if (a<=b && c<=b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
    }
}
