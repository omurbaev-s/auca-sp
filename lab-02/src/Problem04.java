import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Length in inches? ");
        int inches = inp.nextInt();
        final double INCHES_IN_CM = 2.54;

        double cm = inches*INCHES_IN_CM;

        System.out.println(inches + " in. = " + cm +"cm");
    }
}
