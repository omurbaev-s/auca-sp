import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        int N = inp.nextInt();
        while(N<0 || N>46){
            N = inp.nextInt();
        }
        System.out.print(n1+" "+n2+" ");
        for(int i = 2; i<=N; i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
