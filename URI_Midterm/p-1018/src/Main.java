import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number =inp.nextInt();

        int b100 = number/100;
        int b50 = (number%100)/50;
        int b20 = ((number%100)%50)/20;
        int b10 = (((number%100)%50)%20)/10;
        int b5 = ((((number%100)%50)%20)%10)/5;
        int b2 = (((((number%100)%50)%20)%10)%5)/2;
        int b1 = (((((number%100)%50)%20)%10)%5)%2;

        System.out.println(number);
        System.out.println(b100 + " nota(s) de R$ 100,00");
        System.out.println(b50 + " nota(s) de R$ 50,00");
        System.out.println(b20 + " nota(s) de R$ 20,00");
        System.out.println(b10 + " nota(s) de R$ 10,00");
        System.out.println(b5 + " nota(s) de R$ 5,00");
        System.out.println(b2 + " nota(s) de R$ 2,00");
        System.out.println(b1 + " nota(s) de R$ 1,00");






    }
}
