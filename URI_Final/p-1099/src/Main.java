import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 0;
        int s = 0;

        while (i != n) {
            int x = inp.nextInt();
            int y = inp.nextInt();
            if (x < y) {
                while (x <= y) {
                    if (x % 2 != 0) {
                        s += x;
                    } x++;
                }
            } else if(x>y) {
                while (y < x) {
                    if (y % 2 != 0) {
                        s += y;
                    } y++;
                }
            }
            i++;
            System.out.println(s);
            s = 0;
        }
    }
}
