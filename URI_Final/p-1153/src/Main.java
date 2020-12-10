import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p = 1;
        int N = inp.nextInt();
        while(N<0 || N>13){
            N = inp.nextInt();
        }
        for(int i=1; i<=N; i++){
            p=i*p;
        }
        System.out.println(p);
    }
}
