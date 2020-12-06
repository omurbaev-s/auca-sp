import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        int sum;
        Scanner input =new Scanner(System.in);

        while (((m = input.nextInt()) > 0 )&&((n = input.nextInt()) > 0 )) {
            sum = 0;
            if (m > n) {
                for (n = n; n <= m; n++) {
                    sum+=n;
                    System.out.print(n+" ");
                }
                System.out.println("Sum="+sum);
            }else {
                for (m = m; m <= n; m++) {
                    sum+=m;
                    System.out.print(m+" ");
                }
                System.out.println("Sum="+sum);
            }
        }

    }

}