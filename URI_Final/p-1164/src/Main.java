import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int X=0;
        if(N>=1 && N<=100){
            for(int i=1; i<=N; i++){
                X = inp.nextInt();
                if(isPerfect(X)){
                    System.out.println(X+" eh perfeito");
                } else{
                    System.out.println(X+" nao eh perfeito");
                }
            }
        }
    }
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) {
            return true;
        }
        return false;
    }
}
