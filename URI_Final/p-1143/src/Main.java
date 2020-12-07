import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x = 3;
        for(int i=1; i<=n;i++){

            for(int j=1,k=i; j<=x;j++){
                System.out.print(k+" ");
                k=k*i;
            }
            System.out.println(" ");
        }
    }
}
