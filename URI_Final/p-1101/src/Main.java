import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int m = inp.nextInt();
        int n = inp.nextInt();

        while(m>0 && n>0){
            sum = 0;
            if(m>n){
                for(n=n; n<=m; n++){
                    sum+=n;
                    System.out.print(n+" ");
                }
                System.out.println("Sum="+sum);
            } else {
                for(m=m; m<=n; m++){
                    sum+=m;
                    System.out.print(m+" ");
                }
                System.out.println("Sum"+sum);
            }
            m = inp.nextInt();
            n = inp.nextInt();
        }
    }
}
