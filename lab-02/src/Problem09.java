import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number of minutes: ");

        final int MINUTES_IN_YEAR = 525600;

        int m = inp.nextInt();
        int y = m/MINUTES_IN_YEAR;
        int d = (m%525600)/1440;

        System.out.print(m + " minutes is approximately " + y + " years and " + d +" days");




    }
}
