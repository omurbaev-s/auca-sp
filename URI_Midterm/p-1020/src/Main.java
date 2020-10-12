import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int days = inp.nextInt();

        int years = days/365;
        days = days%365;
        int months = days/30;
        int days1 = (days%30);

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days1 + " dia(s)");
    }
}
