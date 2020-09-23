import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("a     a^2     a^3 ");

        int a = inp.nextInt();

        int pow1 = a * a;
        int pow2 = a * a * a;
        System.out.println(a + "     " + pow1 + "       " + pow2);


    }
}
