import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        // Ctrl-Space
        Scanner inp = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = inp.nextLine();
        System.out.print("Hello," + userName + "!");

    }
}
