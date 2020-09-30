import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = inp.nextDouble();
        double length = inp.nextDouble();
        final double PI = 3.14159;

        double area = radius*radius*PI;
        double volume = area*length;


        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is %.1f", volume);
    }
}
