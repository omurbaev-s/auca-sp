import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code1 = scanner.nextInt();
        int number1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        int code2 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double total = number1*price1+number2*price2;
         System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


    }
}
