import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = inp.nextDouble();
        double y = inp.nextDouble();
        double distance = Math.sqrt(((x*x)-0)+(y*y)-0);

        if (distance<=10) {
            System.out.println("Point ("+x+", "+y+") is in the circle");
        } else {
            System.out.println("Point ("+x+", "+y+") is not in the circle");
        }


    }
}
