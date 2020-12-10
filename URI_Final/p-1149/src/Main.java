import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int sum = 0;
        int N = inp.nextInt();
        while(N<=0){
            N= inp.nextInt();
        }
            for (int i = 1; i <= N; i++) {
                sum += A;
                A++;
            }
            System.out.println(sum);

    }
}