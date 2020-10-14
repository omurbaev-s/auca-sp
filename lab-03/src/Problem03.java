import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1st number? ");
        int first = inp.nextInt();
        System.out.print("2nd number? ");
        int second = inp.nextInt();
        System.out.print("3rd number? ");
        int third = inp.nextInt();

        if (first >= second && first >= third){

            System.out.println("The value " + first + " is the greatest one.");
        } else if (second>=first && second>=third) {

            System.out.println("The value " + second + " is the greatest one.");
        } else {
            System.out.println("The value " + third + " is the greatest one.");
        }

    }
}
