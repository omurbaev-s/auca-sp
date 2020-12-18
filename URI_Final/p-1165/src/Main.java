import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int X = 0;
        if (N >= 1 && N <= 100) {
            for (int i = 1; i <= N; i++) {
                X = inp.nextInt();
                if(isPrime(X)){
                    System.out.println(X+" eh primo");
                } else{
                    System.out.println(X+" nao eh primo");
                }
            }

        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
         if(n%i==0){
             return false;
         }
        }
        return true;
    }
}
