import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double number =inp.nextDouble();
        int s = (int)number;

        int b100 = s/100;
        int b50 = (s%100)/50;
        int b20 = ((s%100)%50)/20;
        int b10 = (((s%100)%50)%20)/10;
        int b5 = ((((s%100)%50)%20)%10)/5;
        int b2 = (((((s%100)%50)%20)%10)%5)/2;

        int c1 = (int)(number%100%50%20%10%5%2);
        int c050 = (int)((number-s)/0.50);
        int c025 = (int)(((number-s)%0.50)/0.25);
        int c010 = (int)(((number-s)%0.50%0.25)/0.10);
        int c005 = (int)(((number-s)%0.50%0.25%0.10)/0.05);
        int c001 = (int)(((number-s)%0.50%0.25%0.10%0.05)/0.01);

        System.out.println("NOTAS:");
        System.out.println(b100 + " nota(s) de R$ 100,00");
        System.out.println(b50 + " nota(s) de R$ 50,00");
        System.out.println(b20 + " nota(s) de R$ 20,00");
        System.out.println(b10 + " nota(s) de R$ 10,00");
        System.out.println(b5 + " nota(s) de R$ 5,00");
        System.out.println(b2 + " nota(s) de R$ 2,00");

        System.out.println("MOEDAS:");
        System.out.println(c1 + " moeda(s) de R$ 1,00");
        System.out.println(c050 + " moeda(s) de R$ 0,50");
        System.out.println(c025 + " moeda(s) de R$ 0,25");
        System.out.println(c010 + " moeda(s) de R$ 0,10");
        System.out.println(c005 + " moeda(s) de R$ 0,05");
        System.out.println(c001 + " moeda(s) de R$ 0,01");


    }
}
