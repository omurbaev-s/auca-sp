import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int m = inp.nextInt();
        int n = inp.nextInt();

        while(m>0 && n>0){
            if (m<n){
                while(m<=n){
                    System.out.print(m+" ");
                    sum +=m;
                    m++;
                }
            } else {
                while(m>=n){

                    System.out.print(n+" ");
                    sum +=n;
                    n++;
                }
            }
            System.out.print("Sum="+sum);
            sum = 0;
            m = inp.nextInt();
            n = inp.nextInt();
        }
    }
}
