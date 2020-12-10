import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int i = 0;
        int sum = 0;
        double a;
        while((n=inp.nextInt())>=0){
            sum+=n;
            i++;
        }
        a = ((double)sum/i);
        System.out.printf("%.2f%n",a);
    }
}
