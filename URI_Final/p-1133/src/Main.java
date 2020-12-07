import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();

        if (x < y) {
            int n = 0;
            for (int i = x; i < y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    n += i;
                    System.out.println(n);
                    n = 0;
                }
            }
        } else if (x > y) {
            int n = 0;
            for (int i = y; i < x; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    n += i;
                    System.out.println(n);
                    n = 0;
                }
            }
        }
    }
}