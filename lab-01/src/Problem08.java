import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Please, inter a number!");

        int n = inp.nextInt();
        int sum = (n * (n + 1)) / 2;

        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);


    }
}

