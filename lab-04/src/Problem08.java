import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Weight? ");
        double w = inp.nextDouble();

        if (w>50.0) {
            System.out.println("The package cannot be shipped");
        } else if (w>0.0 && w<=1.0) {
            System.out.println("The cost of shipping is 3.5$");
        } else if (w>1.0 && w<=3.0) {
            System.out.println("The cost of shipping is 5.5$");
        } else if (w>3.0 && w<=10.0) {
            System.out.println("The cost of shipping is 8.5$");
        } else {
            System.out.println("The cost of shipping is 10.5$");
        }
    }
}
