import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A four-digit integer? ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int sum = a+b+c+d;

        System.out.println("The sum of all digits is " + sum);








    }
}
