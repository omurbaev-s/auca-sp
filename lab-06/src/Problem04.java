import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("A: ");
        int a = inp.nextInt();
        System.out.println("B: ");
        int b = inp.nextInt();

        try {
            int r = MathUtils.gcd(a, b);

            System.out.printf("GCD(%d, %d) = %d%n", a, b, r);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}