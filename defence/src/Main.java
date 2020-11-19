import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Year? ");
        int y = inp.nextInt();

        if (y<1) {
            System.out.println("it is not a correct number of year");
            System.exit(1);
        }

        System.out.print("Month? ");
        int m = inp.nextInt();

        if (m<1 || m>12) {
            System.out.println("Wrong number of month");
            System.exit(2);
        }
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30); break;
            case 2:
                if (y%4==0 && y%100!=0 || y%400==0) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }break;
        }
    }
}
