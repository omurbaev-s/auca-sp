import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int ab = (a+b+Math.abs(a-b))/2;
        int abc = (ab+c+Math.abs(ab-c))/2;

        System.out.println(abc + " eh o maior");


    }
}
