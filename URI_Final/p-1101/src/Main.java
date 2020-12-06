import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int m;
        int n;

        while((m= inp.nextInt())>0 && (n= inp.nextInt())>0){
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
        }
    }
}
