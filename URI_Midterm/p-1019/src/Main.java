import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int seconds = inp.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int seconds1 = (seconds%60);

        System.out.println(hours + ":" + minutes + ":" + seconds1);




    }
}
