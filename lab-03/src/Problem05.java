import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number of points? ");

        double points = inp.nextDouble();

        if (points > 100) {
            System.out.printf("%.0f is not in the permitted range%n", points);
        } else if (points>=90 && points<=100) {
            System.out.println("Grade: A");
        } else if (points>=80 && points<=90) {
            System.out.println("Grade: B");
        } else if (points>=70 && points<=80) {
            System.out.println("Grade: C");
        } else if (points>=60 && points<=70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
